package com.jc.aim.algo.for_loop;

import java.util.Scanner;

public class FizzBuzz {

  public static void main(String[] args) {
    // Create Scanner object.
    Scanner input = new Scanner(System.in);

    // Take double input
    System.out.println("Enter a value:");
    int value = input.nextInt();

    for (int i = 1; i <= value; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("FizzBuzz");
      } else if (i % 3 == 0) {
        System.out.println("Fizz");
      } else if (i % 5 == 0) {
        System.out.println("Buzz");
      } else {
        System.out.println(i);
      }
    }

    // close the Scanner object
    input.close();
  }
}
