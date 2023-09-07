package com.example.grpcspringbank;

import com.example.grpcspringbank.entities.Account;
import com.example.grpcspringbank.entities.AccountTransaction;
import com.example.grpcspringbank.entities.Currency;
import com.example.grpcspringbank.enums.AccountStatus;
import com.example.grpcspringbank.enums.AccountType;
import com.example.grpcspringbank.enums.TransactionStatus;
import com.example.grpcspringbank.enums.TransactionType;
import com.example.grpcspringbank.repository.AccountRepository;
import com.example.grpcspringbank.repository.AccountTransactionRepository;
import com.example.grpcspringbank.repository.CurrencyRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Random;
import java.util.UUID;

@SpringBootApplication
public class GrpcSpringBankApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrpcSpringBankApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CurrencyRepository currencyRepository, AccountRepository accountRepository, AccountTransactionRepository accountTransctionRepository){
        return args -> {
            currencyRepository.save(new Currency(null, "USD", "$", 1));
            currencyRepository.save(
                    Currency.builder()
                            .name("MAD")
                            .symbol("DH")
                            .price(0.1)
                            .build()
            );
            currencyRepository.save(new Currency(null, "EURO", "E", 0.98));
            currencyRepository.findAll().forEach(
                    currency -> {
                        System.out.println(currency.toString());
                    }
            );
            List<Currency> currencyList = currencyRepository.findAll();
            for (int i = 0; i < 20; i++) {
                Account account = Account.builder()
                        .id(UUID.randomUUID().toString())
                        .currency(currencyList.get(new Random().nextInt(currencyList.size())))
                        .createdAt(System.currentTimeMillis())
                        .type(Math.random()>0.5? AccountType.CURRENT_ACCOUNT:AccountType.SAVING_ACCOUNT)
                        .status(AccountStatus.CREATED)
                        .build();
                accountRepository.save(account);
            }
            List<Account> accountList = accountRepository.findAll();
            accountList.forEach(account -> {
                for (int i = 0; i <20 ; i++) {
                    AccountTransaction accountTransaction = AccountTransaction.builder()
                            .amount(Math.random()*541236)
                            .timestamp(System.currentTimeMillis())
                            .status(TransactionStatus.PENDING)
                            .type(Math.random() > 0.54 ? TransactionType.DEBIT : TransactionType.CREDIT)
                            .account(account)
                            .build();
                    accountTransctionRepository.save(accountTransaction);
                }
            });
        };
    }
}
