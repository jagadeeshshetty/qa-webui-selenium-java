package com.jc.aim.algo.for_loop;

import java.util.Scanner;

/**
 * Input   -> Output
 * 3 -------> 1
 * 48 ------> 2
 * 0500 ----> 3
 * 71508 ---> 5
 */
public class NumberOfDigits {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a value: ");
    int num = input.nextInt();
    int digits = 0;

    for (; num > 0; num /= 10) {
      System.out.println("Number is " + num + " now.");
      digits++;
    }
    System.out.println("No. of digits: " + digits);

    input.close();
  }
}
