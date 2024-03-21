package com.jc.aim.algo.while_loop;

import java.util.Scanner;

/**
 * Input --------> Output
 * 71508 --------> 3
 * 38 -----------> 2
 * 2147483647 ---> 1
 * 0000 ---------> 0
 */
public class SumUntilSingleDigit {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a value: ");
    int num = input.nextInt();

    int sum = calSumUntilSingleDigit(num);
    System.out.println("Sum of digits: " + sum);

    input.close();
  }

  private static int calSumUntilSingleDigit(int num) {
    int sum = 0;
    while (num > 0 || sum > 9) {
      // If still sum is not single digit
      if (num == 0) {
        num = sum;
        sum = 0;
      }

      // Get the last digit through % modulo
      // Add the last digit to the sum
      sum += num % 10;
      // Remove the last digit
      num /= 10;
    }

    return sum;
  }
}
