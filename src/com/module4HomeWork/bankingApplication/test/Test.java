package com.module4HomeWork.bankingApplication.test;

public class Test {
    public static void main(String[] args) {
        DebitAccountPlan debitAccountPlan = new DebitAccountPlan();
        CreditAccountPlan creditAccountPlan = new CreditAccountPlan();

        AccountLogsImplementation accountLogsImplementation = new AccountLogsImplementation();

            debitAccountPlan.subscribe(accountLogsImplementation);
            creditAccountPlan.subscribe(accountLogsImplementation);

            debitAccountPlan.generateEvents(100, -100 );
            creditAccountPlan.generateEvents(250, -300);
    }
}
