package com.homeTasksLecture3;

import java.util.Scanner;

public class SequentialSearch {
    public static void main(String[] args) {
        int arr[] = {158, 207, 392, 62, 315, 434, 487, 268, 405, 241,};
        Scanner numberToSearch = new Scanner(System.in);
        System.out.println("Enter number ");
        int number = numberToSearch.nextInt();
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                temp = arr[i];
            }

        }
        if (temp != 0) {
            System.out.println("our number is: " + temp);
        } else {
            System.out.println("Try again!");
        }

    }

}



