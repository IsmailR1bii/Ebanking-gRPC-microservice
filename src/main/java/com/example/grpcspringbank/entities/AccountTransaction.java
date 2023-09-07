package com.example.grpcspringbank.entities;

import com.example.grpcspringbank.enums.TransactionStatus;
import com.example.grpcspringbank.enums.TransactionType;
import com.exemple.grpcspringebank.grpc.stub.Bank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private long timestamp;
    private double amount;
    @Enumerated(EnumType.STRING)
    private TransactionType type;
    @Enumerated(EnumType.STRING)
    private TransactionStatus status;
    @ManyToOne
    private Account account;
 }
