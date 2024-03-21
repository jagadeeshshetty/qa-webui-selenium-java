package com.jc.playground;

import java.util.Scanner;

/**
 * 5095 5102
 * Input   -> Output
 * 5095    -> 19
 * 5096    -> 20
 * 5097    -> 21
 * 5098    -> 22
 * 5099    -> 23
 * 5100    -> 6
 * 5101    -> 7
 * 5102    -> 8
 */
public class AddRangeOfDigits {

  public static void main(String[] args) {
    // Create Scanner object.
    Scanner input = new Scanner(System.in);

    // Take double input
    System.out.println("Enter a value for L:");
    int L = input.nextInt();
    System.out.println("Enter a value for R:");
    int R = input.nextInt();

    int sum;
    int tmp;

    for (int N = L; N <= R; N++) {
      System.out.println(N);
      sum = 0;

      for (int num = N; num > 0; num = num / 10) {
        tmp = num % 10;
        sum = sum + tmp;
      }
      System.out.println(sum);
    }

    // close the Scanner object
    input.close();
  }
}
