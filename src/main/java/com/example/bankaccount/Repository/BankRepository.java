package com.example.bankaccount.Repository;

import com.example.bankaccount.Main.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank, Long> {
}
