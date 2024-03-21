package com.jc.playground;

import java.util.Scanner;

public class FizzBuzzBreak {

  public static void main(String[] args) {
    // Create Scanner object.
    Scanner input = new Scanner(System.in);

    // Take double input
    System.out.println("Enter a value:");
    int value = input.nextInt();
    int sum = 0;

    for (int i = 1; i <= value; i++) {
      System.out.println("\nNumber: " + i);
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("FizzBuzz");
      } else if (i % 3 == 0) {
        System.out.println("Fizz");
        // break;
      } else if (i % 5 == 0) {
        System.out.println("Buzz");
      } else {
        sum = sum + i;
      }
      if (sum > 3 * value) {
        System.out.println("break - sum: " + sum);
        break;
      }
    }

    // close the Scanner object
    input.close();
  }
}
