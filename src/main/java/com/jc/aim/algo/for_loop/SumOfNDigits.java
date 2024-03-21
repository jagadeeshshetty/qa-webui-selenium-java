package com.jc.aim.algo.for_loop;

import java.util.Scanner;

/**
 * Input -> Output
 * 20 ----> 1 2 3 … 9 1(10) 2(11) … 8(17) 9(18) 10(19) 2(20)
 */
public class SumOfNDigits {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a value: ");
    int N = input.nextInt();
    int sum = 0;

    for (int num = 1; num <= N; num++) {
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
