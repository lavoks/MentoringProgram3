package com.module4HomeWork.bankingApplication.test;

import com.module4HomeWork.bankingApplication.interfaces.AccountLogs;

public class AccountLogsImplementation implements AccountLogs {
    @Override
    public void onEvent(String data) {
        System.out.println("Account logs: " + data);
    }
}
