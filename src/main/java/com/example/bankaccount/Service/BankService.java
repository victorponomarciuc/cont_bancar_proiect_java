package com.example.bankaccount.Service;


import com.example.bankaccount.Main.Bank;
import com.example.bankaccount.Repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankService {
    @Autowired
    private BankRepository repository;

    public List<Bank> listAll() {
        return repository.findAll();
    }

    public void save(Bank bank) {
        repository.save(bank);
    }

    public Bank get(long id) {
        return repository.findById(id).get();
    }

    public void delete(long id) {
        repository.deleteById(id);
    }
}
