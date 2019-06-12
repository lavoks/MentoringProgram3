package com.homeTasksLecture3;

import java.util.Arrays;

public class ArithmeticMeanMedianMode {


    private static int array[] = {206, 430, 72, 30, 292, 322, 42, 36, 447, 229};
    private static int sortedArray[] = bubbleSort(array);
    private static int sum = sumCalculation(array);

    public static void main(String[] args) {

        System.out.println("Sorted array  " + Arrays.toString(sortedArray));

        int meanVar = mean(array);
        System.out.println("Mean  " + meanVar);

        int medianVar = median(sortedArray);
        System.out.println("Median " + medianVar);

        int modeVar=mode(sortedArray);
        System.out.println("Mode " + modeVar);

        double standartDeviantVar = standartDevian(array);
        System.out.println("Standard Deviant " + standartDeviantVar);
    }

    public static int[] bubbleSort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static int sumCalculation(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = array[i] + sum;
        }
        return sum;
    }

    public static int mean(int array[]) {
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum = array[i] + sum;
//        }
        return sum / array.length;
    }

    public static int median(int array[]) {
        int medianResult;
        if (array.length % 2 == 0) {
            medianResult = (array[array.length / 2] + array[(array.length / 2 - 1)]) / 2;
        } else {
            medianResult = array[array.length / 2];
        }
        return medianResult;
    }

    public static int mode(int array[]) {
        int maxValue=0;
        int maxCount=0;
        for(int i=0; i<array.length; i++){
            int count=0;
            for (int j=0; j<array.length; j++){
                if (array[j]==array[i]){
                        count++;
                }
            }if (count>maxCount){
                maxCount=count;
                maxValue=array[i];
            }
        }

        return maxValue;
    }

    public static double standartDevian(int array[]){
        double x=1.6;
        double sumDeviant=0;

        for (int i=0; i<array.length; i++){
            sumDeviant = (array[i]-x) + sumDeviant;
        }
        return Math.sqrt(sumDeviant/array.length);
    }

}


