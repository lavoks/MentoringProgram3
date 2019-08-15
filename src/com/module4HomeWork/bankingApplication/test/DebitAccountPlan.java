package com.module4HomeWork.bankingApplication.test;

import com.module4HomeWork.bankingApplication.AbstractBankAccount;

public class DebitAccountPlan extends AbstractBankAccount {

    @Override
    public void generateEvents(double balance, double amount) {
        notifyAll("Debit Account Plan "  + transaction(balance, amount));

    }

    @Override
    public double withdrawMoney(double balance, double withdrawAmount) {
        if (balance >= - withdrawAmount) {
            balance = balance + withdrawAmount + calculatePaymentFee(balance, withdrawAmount); // to add fee amount
            System.out.println("Your account balance " + balance);

        } else {
            System.out.println("Not enough money, your Debit account balance " + balance + ", Amount " + withdrawAmount + " is too big");
        }
        return balance;
    }

    @Override
    public double calculatePaymentFee(double balance, double withdrawAmount) {
        return withdrawAmount * 0.01;
    }
}
