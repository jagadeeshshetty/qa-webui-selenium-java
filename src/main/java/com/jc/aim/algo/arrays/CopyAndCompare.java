package com.jc.aim.algo.arrays;

import java.util.Arrays;

public class CopyAndCompare {
  public static void main(String[] args) {
    int[] arr1 = { 5, -3, 7, 8, 2 };

    int[] arr2 = Arrays.copyOf(arr1, arr1.length);

    System.out.println("arr2 → " + arr2 + " → " + Arrays.toString(arr2));
    System.out.println("arr1 → " + arr1 + " → " + Arrays.toString(arr1));
    System.out.print("arr1 == arr2 ? ");
    System.out.println(arr1 == arr2);
  }
}
