package com.example.grpcspringbank.mappers;

import com.example.grpcspringbank.entities.Account;
import com.example.grpcspringbank.entities.AccountTransaction;
import com.example.grpcspringbank.enums.AccountStatus;
import com.example.grpcspringbank.enums.AccountType;
import com.example.grpcspringbank.enums.TransactionStatus;
import com.example.grpcspringbank.enums.TransactionType;
import com.exemple.grpcspringebank.grpc.stub.Bank;
import org.springframework.stereotype.Service;

@Service
public class AccountMapperImpl {
    public Bank.Account fromBankCount(Account account){
        Bank.Account account1 = Bank.Account.newBuilder()
                .setAccountId(account.getId())
                .setBalance(account.getBalance())
                .setCreateAt(account.getCreatedAt())
                .setStatus(Bank.AccountStatus.valueOf(account.getStatus().toString()))
                .setType(Bank.AccountType.valueOf(account.getType().toString()))
                .build();
        return account1;
    }

    public Account fromGrpcAccount(Bank.Account account){
        Account account1 = new Account();
        account1.setId(account.getAccountId());
        account1.setBalance(account.getBalance());
        account1.setCreatedAt(account.getCreateAt());
        account1.setType(AccountType.valueOf(account.getType().toString()));
        account1.setStatus(AccountStatus.valueOf(account.getStatus().toString()));
        return account1;
    }

    public Bank.AccountTransaction fromAccountTransaction(AccountTransaction accountTransaction){
        Bank.AccountTransaction accountTransaction1 = Bank.AccountTransaction.newBuilder()
                .setTransactionId(accountTransaction.getId())
                .setAccountId(accountTransaction.getAccount().getId())
                .setTransactionDate(accountTransaction.getTimestamp())
                .setAmount(accountTransaction.getAmount())
                .setStatus(Bank.TransactionStatus.valueOf(accountTransaction.getStatus().toString()))
                .setType(Bank.TransactionType.valueOf(accountTransaction.getType().toString()))
                .build();
        return  accountTransaction1;
    }

    public AccountTransaction fromGrpcAccountTransaction(Bank.AccountTransaction accountTransaction){
        AccountTransaction accountTransaction1 = new AccountTransaction();
        accountTransaction1.setAmount(accountTransaction.getAmount());
        accountTransaction1.setTimestamp(accountTransaction.getTransactionDate());
        accountTransaction1.setType(TransactionType.valueOf(accountTransaction.getType().toString()));
        accountTransaction1.setStatus(TransactionStatus.valueOf(accountTransaction.getStatus().toString()));
        accountTransaction1.setId(accountTransaction1.getId());
        return accountTransaction1;
    }
}
