package com.example.grpcspringbank.services;

import com.example.grpcspringbank.entities.Account;
import com.example.grpcspringbank.entities.AccountTransaction;
import com.example.grpcspringbank.entities.Currency;
import com.example.grpcspringbank.enums.TransactionStatus;
import com.example.grpcspringbank.enums.TransactionType;
import com.example.grpcspringbank.mappers.AccountMapperImpl;
import com.example.grpcspringbank.repository.AccountRepository;
import com.example.grpcspringbank.repository.AccountTransactionRepository;
import com.example.grpcspringbank.repository.CurrencyRepository;
import com.exemple.grpcspringebank.grpc.stub.Bank;
import com.exemple.grpcspringebank.grpc.stub.BankServiceGrpc;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;


@GrpcService
@AllArgsConstructor
public class GrpcBankService extends BankServiceGrpc.BankServiceImplBase {

    private final CurrencyRepository currencyRepository;
    private final AccountRepository accountRepository;
    private final AccountMapperImpl accountMapper;
    private final AccountTransactionRepository accountTransactionRepository;
    @Override
    public void convert(Bank.ConvertCurrencyRequest request, StreamObserver<Bank.ConvertCurrencyResponse> responseObserver) {
        String from = request.getCurrencyFrom();
        String to = request.getCurrencyTo();
        double amount = request.getAmount();
        Currency currencyFrom = currencyRepository.findByName(from);
        Currency currencyTo = currencyRepository.findByName(to);
        double result = amount * (currencyFrom.getPrice() / currencyTo.getPrice());
        Bank.ConvertCurrencyResponse response = Bank.ConvertCurrencyResponse.newBuilder()
                .setCurrencyFrom(from)
                .setCurrencyTo(to)
                .setAmount(amount)
                .setResult(result)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    /*
    @Override
    public void getAccount(Bank.GetAccountRequest request, StreamObserver<Bank.GetAccountResponse> responseObserver) {
        Account account = accountRepository.findById(request.getId()).orElse(null);
        if(account != null){
            Bank.Account account1 = accountMapper.fromBankCount(account);
            Bank.GetAccountResponse response = Bank.GetAccountResponse.newBuilder()
                    .setAccount(account1)
                    .build();
            responseObserver.onNext(response);
        }
        responseObserver.onCompleted();
    }
    */

    @Override
    public void getAccount(Bank.GetAccountRequest request, StreamObserver<Bank.GetAccountResponse> responseObserver) {
        Account account = accountRepository.findById(request.getId()).orElse(null);
        if (account != null){
            Bank.GetAccountResponse accountResponse = Bank.GetAccountResponse.newBuilder()
                    .setAccount(accountMapper.fromBankCount(account))
                    .build();
            responseObserver.onNext(accountResponse);
        }
        else
            responseObserver.onError(
                    Status.INTERNAL
                            .withDescription("NO ACCOUNT FOUND  for this account => " + request.getId())
                            .asException()
            );
        responseObserver.onCompleted();
    }

    /*
    @Override
    public void getListAccount(Bank.GetListAccountRequest request, StreamObserver<Bank.GetListAccountResponse> responseObserver) {
        List<Account> accountList = accountRepository.findAll();
        List<Bank.Account> accountList1 = accountList
                .stream()
                .map(account -> accountMapper.fromBankCount(account))
                .collect(Collectors.toList());
        Bank.GetListAccountResponse listAccountResponse = Bank.GetListAccountResponse.newBuilder()
                .addAllAccounts(accountList1)
                .build();
        responseObserver.onNext(listAccountResponse);
        responseObserver.onCompleted();
    }

     */

    @Override
    public void getListAccount(Bank.GetListAccountRequest request, StreamObserver<Bank.GetListAccountResponse> responseObserver) {
        List<Account> accountList = accountRepository.findAll();
        List<Bank.Account> accounts = accountList.stream().map(accountMapper::fromBankCount).toList();
        responseObserver.onNext(Bank.GetListAccountResponse.newBuilder().addAllAccounts(accounts).build());
        responseObserver.onCompleted();

    }

    /*
    @Override
    public void getStreamOfAccountTransactions(Bank.GetStreamOfAccountTransactionRequest request, StreamObserver<Bank.AccountTransaction> responseObserver) {
        String requestId = request.getAccountId();
        List<AccountTransaction> byAccountId = accountTransactionRepository.findByAccount_Id(requestId);
        if (byAccountId.size() == 0){
            responseObserver.onError(
                    Status.INTERNAL
                            .withDescription("NO TRANSACTION FOUND  for this account => " + requestId)
                            .asException()
            );
            return;
        }
        Stack<AccountTransaction> accountTransactionStack = new Stack<>();
        accountTransactionStack.addAll(byAccountId);
        Timer timer = new Timer("Transaction Timer");
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                AccountTransaction accountTransaction = accountTransactionStack.pop();
                //System.out.println(accountTransactionStack.size());
                responseObserver.onNext(accountMapper.fromAccountTransaction(accountTransaction));
                if(accountTransactionStack.empty()){
                    responseObserver.onCompleted();
                    timer.cancel();
                }
            }
        },0,1000);
    }

     */

    @Override
    public void getStreamOfAccountTransactions(Bank.GetStreamOfAccountTransactionRequest request, StreamObserver<Bank.AccountTransaction> responseObserver) {
        List<AccountTransaction> accountTransactions = accountTransactionRepository.findByAccount_Id(request.getAccountId());
        if (accountTransactions.isEmpty()) {
            responseObserver.onError(
                    Status.INTERNAL
                            .withDescription("NO TRANSACTIONS FOUND FOR THIS ACC OF id => " + request.getAccountId())
                            .asException()
            );
            return;
        }
        List<Bank.AccountTransaction> accountTransactionList = accountTransactions.stream().map(accountMapper::fromAccountTransaction).toList();
        Stack<Bank.AccountTransaction> accountTransactionStack = new Stack<>();
        accountTransactionStack.addAll(accountTransactionList);
        Timer timer = new Timer("transaction streamer");
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                responseObserver.onNext(accountTransactionStack.pop());
                if (accountTransactionStack.empty()){
                    responseObserver.onCompleted();
                    timer.cancel();
                }
            }
        },1000, 1000);
    }

    @Override
    public StreamObserver<Bank.AccountTransaction> submitStreamOfTransactions(StreamObserver<Bank.PerformStreamOfTransactionsResponse> responseObserver) {
        List<AccountTransaction> accountTransactions = new ArrayList<>();
        return new StreamObserver<Bank.AccountTransaction>() {
            @Override
            public void onNext(Bank.AccountTransaction accountTransaction) {
                Account account = accountRepository.findById(accountTransaction.getAccountId()).orElse(null);
                AccountTransaction accountTransaction1 = accountMapper.fromGrpcAccountTransaction(accountTransaction);
                if (account != null ){
                    accountTransaction1.setStatus(TransactionStatus.EXECUTED);
                    accountTransactionRepository.save(accountTransaction1);
                    accountTransactions.add(accountTransaction1);
                }
                else {
                    Status.INTERNAL
                            .withDescription("NO account for founded for this transaction of id => " + accountTransaction.getTransactionId())
                            .asException();
                }
            }

            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
            }

            @Override
            public void onCompleted() {
                int totalPerformedTransaction = accountTransactions.size();
                double totalAmountOfAllTransactions = 0;
                double totalAmountOfDebitTransactions = 0;
                double totalAmountOfCreditTransactions = 0;
                for (AccountTransaction accountTransaction : accountTransactions){
                    if (accountTransaction.getType().equals(TransactionType.CREDIT))
                        totalAmountOfCreditTransactions = totalAmountOfCreditTransactions + accountTransaction.getAmount();
                    else
                        totalAmountOfDebitTransactions = totalAmountOfDebitTransactions + accountTransaction.getAmount();
                }
                totalAmountOfAllTransactions = totalAmountOfCreditTransactions + totalAmountOfDebitTransactions;
                Bank.PerformStreamOfTransactionsResponse performStreamOfTransactionsResponse = Bank.PerformStreamOfTransactionsResponse.newBuilder()
                        .setTotalAmountOfPerformedTransactions(totalPerformedTransaction)
                        .setTotalAmountOfPerformedDebitTransactions(totalAmountOfDebitTransactions)
                        .setNumberOfPerformedTransactions(totalPerformedTransaction)
                        .setTotalAmountOfPerformedCreditTransactions(totalAmountOfCreditTransactions)
                        .build();
                responseObserver.onNext(performStreamOfTransactionsResponse);
                responseObserver.onCompleted();
            }
        };
    }

    /*
    @Override
    public StreamObserver<Bank.AccountTransaction> submitStreamOfTransactions(StreamObserver<Bank.PerformStreamOfTransactionsResponse> responseObserver) {
        List<AccountTransaction> accountTransactions = new ArrayList<>();
        Bank.PerformStreamOfTransactionsResponse response = Bank.PerformStreamOfTransactionsResponse.getDefaultInstance();
        return new StreamObserver<Bank.AccountTransaction>() {
            @Override
            public void onNext(Bank.AccountTransaction accountTransaction) {
                Account account = accountRepository.findById(accountTransaction.getAccountId()).orElse(null);
                AccountTransaction accountTransaction1 = accountMapper.fromGrpcAccountTransaction(accountTransaction);
                if (account != null){
                    accountTransaction1.setAccount(account);
                    accountTransaction1.setStatus(TransactionStatus.EXECUTED);
                }
                else {
                    responseObserver.onError(Status.INTERNAL.withDescription("Account Not found").asException());
                }
                accountTransactions.add(accountTransaction1);
                accountTransactionRepository.save(accountTransaction1);
            }

            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
            }

            @Override
            public void onCompleted() {
                int debitTransactionCount = 0;
                int creditTransactionCount = 0;
                double totalAmountCreditTransaction = 0.0;
                double totalAmountDebitTransaction = 0.0;
                for (AccountTransaction at : accountTransactions){
                    if (at.getType().equals(TransactionType.CREDIT)){
                        creditTransactionCount++;
                        totalAmountCreditTransaction += at.getAmount();
                    }
                    else {
                        debitTransactionCount++;
                        totalAmountDebitTransaction += at.getAmount();
                    }
                }
                Bank.PerformStreamOfTransactionsResponse response1 = Bank.PerformStreamOfTransactionsResponse.newBuilder()
                        .setNumberOfPerformedTransactions(accountTransactions.size())
                        .setTotalAmountOfPerformedCreditTransactions(totalAmountCreditTransaction)
                        .setTotalAmountOfPerformedDebitTransactions(totalAmountDebitTransaction)
                        .setTotalAmountOfPerformedTransactions(totalAmountCreditTransaction + totalAmountDebitTransaction)
                        .build();
                responseObserver.onNext(response1);
                responseObserver.onCompleted();
            }
        };
    }

     */



    @Override
    public StreamObserver<Bank.AccountTransaction> executeStreamOfTransaction(StreamObserver<Bank.AccountTransaction> responseObserver) {
        return new StreamObserver<Bank.AccountTransaction>() {
            @Override
            public void onNext(Bank.AccountTransaction accountTransaction) {
                if (accountTransaction.getAmount() > 100){
                    Bank.AccountTransaction performedTransaction = Bank.AccountTransaction.newBuilder()
                            .setStatus(Bank.TransactionStatus.EXECUTED)
                            .build();
                    responseObserver.onNext(performedTransaction);
                }
                else {
                    //throw new RuntimeException("the transaction "+ accountTransaction.getTransactionId() + " is rejected");
                    responseObserver.onError(Status.INTERNAL.withDescription("Transaction rejected").asException());
                }
            }

            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}
