package com.homeTasksLecture3;

import java.util.Scanner;

public class ChiniseZodiak {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int year;
        int zodiacYear;
        int zodiacColor;


        String[] zodiacs = {"Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep"};
        String[] colors = {"White", "White", "Blue", "Blue", "Green", "Green", "Red", "Red", "Yellow", "Yellow"};

        System.out.println("Please enter the year: ");
        year = input.nextInt();

        while (year < 0) {
            System.out.println("please enter year > 0");
            year = input.nextInt();
        }
        zodiacYear = year % 12;
        zodiacColor = year % 10;

        System.out.println("Year " + year + " and Chinese Zodiac is " + colors[zodiacColor] + " " + zodiacs[zodiacYear]);

    }

}