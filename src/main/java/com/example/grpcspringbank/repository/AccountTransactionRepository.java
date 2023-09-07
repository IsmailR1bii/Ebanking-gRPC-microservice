package com.example.grpcspringbank.repository;

import com.example.grpcspringbank.entities.AccountTransaction;
import com.exemple.grpcspringebank.grpc.stub.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountTransactionRepository extends JpaRepository<AccountTransaction, Long> {
    List<AccountTransaction> findByAccount_Id(String accountId);
}
