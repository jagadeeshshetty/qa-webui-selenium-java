package com.jc.aim.algo.arrays;

public class DeclareAssignAccess {

  public static void main(String[] args) {
    // Init array with size
    int[] arr = new int[5];

    // Access individual element
    // By default 0 will be assigned
    System.out.println(arr[0]);

    // Assign values
    arr[0] = 10;
    arr[2] = 30;

    // Access and print all element values
    for (int index = 0; index < arr.length - 1; index++) {
      System.out.println("[" + index + "] → Value: " + arr[index]);
    }
  }
}
