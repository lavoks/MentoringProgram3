package com.homeTasksLecture3;

import java.util.Scanner;

public class ConverterHomeTask {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int number;
        int units;
        int tens;
        int hundreds;


        String[] arrayUnits = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] arrayTens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety", ""};
        String[] arrayTenNineteen = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        System.out.println("Enter any number: ");
        if (num.hasNextInt()) {

            number = num.nextInt();

            units = number % 10;
            tens = (number % 100 - units) / 10;
            hundreds = (number % 1000 - units - tens) / 100;
            boolean tenNineteenHundreds = (number >= 110 & number < 120) | (number >= 210 & number < 220) | (number >= 310 & number < 320) | (number >= 410 & number < 420) | (number >= 510 & number < 520) | (number >= 610 & number < 620) | (number >= 710 & number < 720) | (number >= 810 & number < 820) | (number >= 910 & number < 920);

            if (number == 0) {
                System.out.println("Number is " + arrayUnits[units]);
            } else if (number < 10 & number > 0) {
                System.out.println("Number is " + arrayUnits[units]);

            } else if (number >= 10 & number < 20) {
                System.out.println("Number is " + arrayTenNineteen[units]);
            } else if (number > 20 & number < 100) {
                System.out.println("Number is " + arrayTens[tens] + " " + arrayUnits[units]);
            } else if (number % 100 == 0) {
                System.out.println("Number is " + arrayUnits[hundreds] + " hundred");
            } else if (tenNineteenHundreds) {
                System.out.println("Number is " + arrayUnits[hundreds] + " hundred " + arrayTenNineteen[units]);
            } else if (number < 0 | number > 1000) {
                System.out.println("Number is not in range 0-1000");
            } else {
                System.out.println("Number is " + arrayUnits[hundreds] + " hundred  " + arrayTens[tens] + " " + arrayUnits[units]);
            }
        } else {
            System.out.println("Symbol you entered is not inter");
        }
    }
}
