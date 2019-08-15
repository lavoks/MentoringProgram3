package com.module4HomeWork.squareCalculation;

public class Area extends Shape {
    public void rectangleArea(int length, int breath) {
        System.out.println(length * breath);

    }

    public void squareArea(int side) {
        System.out.println(side * side);
    }

    public void circleArea(int radius) {
        System.out.println(Math.PI * radius * radius);
    }
}
