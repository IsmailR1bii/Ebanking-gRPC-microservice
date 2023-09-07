package com.example.grpcspringbank.entities;

import com.example.grpcspringbank.enums.AccountStatus;
import com.example.grpcspringbank.enums.AccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Account {
    @Id
    private String id;
    private double balance;
    private Long createdAt;
    @Enumerated(EnumType.STRING)
    private AccountType type;
    @Enumerated(EnumType.STRING)
    private AccountStatus status;
    @ManyToOne
    private Currency currency;
    @OneToMany(mappedBy = "account")
    private List<AccountTransaction> transactions;
}
