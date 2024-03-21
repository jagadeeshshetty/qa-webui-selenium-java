package com.jc.aim.algo.arrays;

import java.util.Scanner;

/**
 * 3
 * 1 2 3
 * 2
 * true
 */
public class IsNumPresent {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Length of array
    System.out.print("Enter the array size: ");
    int N = sc.nextInt();

    // Create array as per length
    // Assign values from scanner object
    int[] arr = new int[N];
    System.out.print("Enter the array values separated by sapce: ");
    for (int i = 0; i < N; i++) {
      arr[i] = sc.nextInt();
    }

    // The number to be present
    System.out.print("Enter the target value: ");
    int target = sc.nextInt();

    boolean isPresent = false;

    for (int i = 0; i < N; i++) {
      if (arr[i] == target) {
        isPresent = true;
        break;
      }
    }

    System.out.println("The '" + target + "' value present ? " + isPresent);
  }
}
