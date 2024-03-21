package com.jc.aim.algo.arrays;

import java.util.Arrays;

public class CompareArrays {
  public static void main(String[] args) {
    int[] arr1 = { 5, -3, 7, 8, 2 };
    int[] arr2 = { 5, -3, 7, 8, 2 };

    // FALSE - It compares the memory address
    // of arr1 and arr2 instead of values
    System.out.print("arr1 == arr2 ? ");
    System.out.println(arr1 == arr2);

    // TRUE - Compares the values of both array
    System.out.println("Arrays.equals(arr1, arr2) ? " + Arrays.equals(arr1, arr2));
  }

}
