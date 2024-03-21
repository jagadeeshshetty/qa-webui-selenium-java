package com.jc.aim.algo.for_loop;

import java.util.Scanner;

/**
 * Input -> Output
 * 20 ----> 6(15) 7(16) 8(17) 9(18) 10(19) 2(20)
 */
public class SumOfRangeOfDigits {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a start value: ");
    int start = input.nextInt();
    System.out.print("Enter a end value: ");
    int end = input.nextInt();
    int sum = 0;

    for (int num = start; num <= end; num++) {
      sum = num;
      if (num > 9) {
        sum = 0;
        // num /= 10 removes the last digit
        for (int digits = num; digits > 0; digits /= 10) {
          // fetch the last digit
          sum += digits % 10;
        }
      }
      System.out.println(num + " -> " + sum);
    }

    input.close();
  }
}
