package com.jc.aim.algo.for_loop;

import java.util.Scanner;

/**
 * Input   -> Output
 * 3 -------> 3
 * 48 ------> 12
 * 0500 ----> 5
 * 71508 ---> 21
 */
public class SumOfDigits {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a value: ");
    int num = input.nextInt();
    int digits = 0;
    int sum = 0;

    for (; num > 0; num /= 10) {
      int lastDigit = num % 10;
      sum = sum + lastDigit;
      digits++;
    }

    System.out.println("Sum of digits: " + sum);

    input.close();
  }
}
