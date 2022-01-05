package com.example.bankaccount.Main;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bank {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String account_name;
    private String transaction;
    private int amount;

    public Bank() {
    }

    public Bank(Long id, String account_name, String transaction, int amount) {
        this.id = id;
        this.account_name = account_name;
        this.transaction = transaction;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountName() {
        return account_name;
    }

    public void setAccountName(String account_name) {
        this.account_name = account_name;
    }

    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Bank [id=" + id + ", account_name=" + account_name + ", transaction=" + transaction + ", amount=" + amount + "]";
    }
}
