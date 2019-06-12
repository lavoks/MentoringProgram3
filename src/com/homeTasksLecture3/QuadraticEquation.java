package com.homeTasksLecture3;

public class QuadraticEquation {


    public static void main(String[] args) {
        int a = 150;
        int b = -150;
        int c = 0;
        double x1;
        double x2;
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("x1=" + x1 + ", x2=" + x2);
        } else if (discriminant == 0) {
            x1 = -b / (28 * a);
            System.out.println("There is only one root" + x1);
        } else {
            System.out.println("There is no solution");
        }
    }
}
