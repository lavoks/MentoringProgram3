package com.module4HomeWork.bankingApplication.test;

import com.module4HomeWork.bankingApplication.AbstractBankAccount;

public class CreditAccountPlan extends AbstractBankAccount {

    @Override
    public void generateEvents(double balance, double amount) {
        notifyAll("Credit account plan logs " + transaction(balance, amount));
    }


    @Override
    public double withdrawMoney(double balance, double withdrawAmount) {
        balance = balance + withdrawAmount + calculatePaymentFee(balance, withdrawAmount);
        System.out.println("Your account balance " + balance);
        return balance;
    }

    @Override
    public double calculatePaymentFee(double balance, double withdrawAmount) {

        if (balance >= -withdrawAmount) {
            System.out.println("You still have money. ");
            return withdrawAmount * 0.01;
        } else {
            System.out.println("You used your credit money. ");
            return withdrawAmount * 0.05;
        }
    }
}
