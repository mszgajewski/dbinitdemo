package com.example.dbinitdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DbInitializer implements CommandLineRunner {
    private BankAccountRepository bankAccountRepository;

    @Override
    public void run(String... args) throws Exception {
        this.bankAccountRepository.deleteAll();

        BankAccount bankAccount1 = new BankAccount("John",400);
        BankAccount bankAccount2 = new BankAccount("Anna",600);

        this.bankAccountRepository.save(bankAccount1);
        this.bankAccountRepository.save(bankAccount2);

    }
}
