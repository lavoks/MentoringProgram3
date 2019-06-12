package com.stars;

public class SevenStars {
    public static void main(String[] args) {
        int a=9;
        for (int i=1; i<a; i++){
            for (int j=1; j<a; j++){
                if (j<=i){
                    System.out.print(j);
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
