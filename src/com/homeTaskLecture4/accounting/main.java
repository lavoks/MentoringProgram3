package com.homeTaskLecture4.accounting;

public class main {
    public static void main(String[] args) {
        Accounting calc = new Accounting();
        double salary = calc.pay(2.5, 8);
        System.out.println(salary);
    }
}
