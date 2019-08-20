package com.module5Homework.triangle;

public class TriangleDescribtion {
    public static void main(String[] args) {
        Point A = new Point(1, 1);
        Point B = new Point(2,2);
        Point C = new Point(3,2);
        try {
            System.out.println("Area " + TriangleSquareFormula.triangleSquare(A, B, C));
        } catch (TriangleExeption triangleExeption) {
            triangleExeption.printStackTrace();
        }
    }

}
