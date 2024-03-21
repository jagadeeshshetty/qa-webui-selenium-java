package com.jc.aim.algo.arrays;

public class DeclareInitialize {

  public static void main(String[] args) {
    // Declare and init array
    int[] arr = { 5, -3, 7, 8, 2 };

    System.out.println(arr.length);

    // another way of for loop
    for (int value : arr) {
      System.out.print(value + " ");
    }

    // Print all elements of array
    System.out.println(java.util.Arrays.toString(arr));
  }
}
