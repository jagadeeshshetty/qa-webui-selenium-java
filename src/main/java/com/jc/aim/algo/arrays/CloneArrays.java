package com.jc.aim.algo.arrays;

import java.util.Arrays;

public class CloneArrays {
  public static void main(String[] args) {
    int[] arr1 = { 5, -3, 7, 8, 2 };
    int[] arr2 = arr1;

    // TRUE - Even though it compares the memory address
    // of arr1 and arr2 instead of values, both points
    // to same memory address
    System.out.print("arr1 == arr2 ? ");
    System.out.println(arr1 == arr2);

    // update any value
    arr2[2] = 10;
    System.out.println("arr2 → " + Arrays.toString(arr2));
    System.out.println("arr1 → " + Arrays.toString(arr1));
  }
}
