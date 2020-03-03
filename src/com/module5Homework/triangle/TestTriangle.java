package com.module5Homework.triangle;

public class TestTriangle {
    public static void main(String[] args) {
        Point A = new Point(1, 1);
        Point B = new Point(3,1);
        Point C = new Point(3,3);
        try {
            System.out.println("Area " + TriangleSquareFormula.triangleSquare(A, B, C));
        } catch (TriangleExeption triangleExeption) {
            triangleExeption.printStackTrace();
        }
    }

}
