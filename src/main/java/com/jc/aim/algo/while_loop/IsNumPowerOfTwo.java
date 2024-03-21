package com.jc.aim.algo.while_loop;

import java.util.Scanner;

public class IsNumPowerOfTwo {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number:");
    int num = input.nextInt();

    System.out.println(isNumPowerOfTwo(num));

    input.close();
  }

  private static boolean isNumPowerOfTwo(int num) {
    if (num <= 0) return false;
    while (num % 2 == 0) num = num / 2;
    return (num == 1) ? true : false;
  }
}
