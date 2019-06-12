package com.calc;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int c =calc.add(10, 20);
        System.out.println(c );
        Calculator.mem(111);
        System.out.println(Calculator.getMem());
    }
}
