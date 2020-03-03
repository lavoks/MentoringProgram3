package com.module5Homework.triangle;

public class TriangleSquareFormula {

    public static double triangleSquare(Point A, Point B, Point C) throws TriangleExeption {
        double triangleSquare = ((A.x * B.y +B.x*C.y +C.x*A.y)-(A.y*B.x+B.y*C.x+C.y*A.x)) / 2;
        if(triangleSquare==0){
            throw new TriangleExeption("errrrrrrrrrrrrrrrrr");
        }
        return triangleSquare;
    }

}
