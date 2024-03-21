package com.jc.aim.algo.arrays;

import java.util.Arrays;

public class ArraysClassMethods {

  public static void main(String[] args) {
    // Declare and init array
    int[] arr = { 5, -3, 7, 8, 2 };

    // Print all elements of array
    System.out.println("Before Sort → " + Arrays.toString(arr));

    // Sort the array in ascending order
    Arrays.sort(arr);
    System.out.println("After Sort → " + Arrays.toString(arr));

    // Fill entire array
    Arrays.fill(arr, 5);
    System.out.println("After Fill → " + Arrays.toString(arr));
  }
}
