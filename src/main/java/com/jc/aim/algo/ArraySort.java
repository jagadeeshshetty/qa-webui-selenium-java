package com.jc.aim.algo;

import java.util.Arrays;
import java.util.Random;

public class ArraySort {

    public static void main(String[] args) {
        int[] intArray = {35, 10, (int) 5.25, 15, 2};

        bubbleSortUsing2ForLoops(intArray); // O(n^2)
        bubbleSortUsing2ForLoops(generateIntegerArrays(10));
    }

    public static void bubbleSortUsing2ForLoops(int[] intArray) {
        System.out.println("-".repeat(12));
        System.out.println("Before Sorting: " + Arrays.toString(intArray));

        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] > intArray[j]) {
                    int temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }

        System.out.println("After Sorting:  " + Arrays.toString(intArray));
        System.out.println("-".repeat(12));
    }

    public static int[] generateIntegerArrays(int number) {
        // Create an empty array
        int[] intArray = new int[number];

        // Generate the random integers between 1 and number
        Random random = new Random();
        for (int i = 0; i < number; i++) {
            intArray[i] = random.nextInt(number) + 1;
        }

        return intArray;
    }
}
