package com.calc;

public class Calculator {
    private static int memValue;

    public static int add(int a, int b) {
        return a + b;
    }

    public static void mem(int value) {
        memValue = value;

    }
    public static int getMem(){
        return memValue;
    }
}
