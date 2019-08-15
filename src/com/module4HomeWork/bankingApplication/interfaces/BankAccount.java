package com.module4HomeWork.bankingApplication.interfaces;

public interface BankAccount {
    void subscribe(AccountLogs accountLogs);
    void generateEvents(double balance, double amount);
}
