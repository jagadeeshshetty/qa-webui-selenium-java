package com.jc.playground;

import java.util.Scanner;

public class AddDigitsUntilSingleDigit {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number : ");
    // int num = input.nextInt();
    int num = 38;
    int result = addDigits(num);
    input.close();
  }

  /**
   * 38 => 3 + 8 => 11, 
   * @param num
   * @return
   */
  static int addDigits(int num) {
    int result = 0;
    // int sum = 0;
    // int tmp;

    // // Without initialization
    // // for (; N > 0; N = N / 10) {
    // for (int num = N; num > 0; num = num / 10) {
    //   tmp = num % 10;
    //   sum = sum + tmp;
    // }

    // System.out.println(sum);
    return result;
  }
}
