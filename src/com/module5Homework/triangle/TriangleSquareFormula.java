package com.module5Homework.triangle;

public class TriangleSquareFormula {

    public static double triangleSquare(Point A, Point B, Point C) {

        double triangleSquare = (A.x * (B.y - C.y) + B.x * (C.y - A.y) + C.x * (A.y - B.y)) / 2;
        return triangleSquare;
    }

}