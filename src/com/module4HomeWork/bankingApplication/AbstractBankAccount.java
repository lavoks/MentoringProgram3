package com.module4HomeWork.bankingApplication;

import com.module4HomeWork.bankingApplication.interfaces.AccountLogs;
import com.module4HomeWork.bankingApplication.interfaces.BankAccount;
import com.module4HomeWork.bankingApplication.test.AccountLogsImplementation;

public abstract class AbstractBankAccount implements BankAccount {

    private AccountLogs accountLogs = new AccountLogsImplementation();

    @Override
    public void subscribe(AccountLogs accountLogs) {

    }

    protected void notifyAll(String data) {
        accountLogs.onEvent(data);
    }

    protected double transaction(double balance, double amount) {
        if (amount >= 0) {
            return addMoney(balance, amount);
        } else {
            return withdrawMoney(balance, amount);
        }
    }

    private double addMoney(double balance, double addAmount) {
       return balance + addAmount;
    }

    public abstract double withdrawMoney(double balance, double withdrawAmount);

    public abstract double calculatePaymentFee(double balance, double withdrawAmount);

}
