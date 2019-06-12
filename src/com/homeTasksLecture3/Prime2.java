package com.homeTasksLecture3;

public class Prime2 {

    public static void main(String[] args) {


        long to = 500;

         String primeNumbersFound = "";

         for (int i = 1; i <= to; i++) {

            if (checkPrime(i)) {
                primeNumbersFound = primeNumbersFound + i + " ";
            }
        }

        System.out.println(primeNumbersFound);
    }
    private static boolean checkPrime(int numberToCheck) {
        int remainder;
        for (int i = 2; i <= numberToCheck / 2; i++) {
            remainder = numberToCheck % i;

            if (remainder == 0) {
                return false;
            }
        }
        return true;

    }

}
