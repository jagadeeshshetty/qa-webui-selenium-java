package com.jc.playground;

import java.util.Scanner;

public class AddDigits {

  public static void main(String[] args) {
    // Create Scanner object.
    Scanner input = new Scanner(System.in);

    // Take double input
    System.out.println("Enter a value:");
    int N = input.nextInt();
    int sum = 0;
    int tmp;

    // Without initialization
    // for (; N > 0; N = N / 10) {
    for (int num = N; num > 0; num = num / 10) {
      tmp = num % 10;
      sum = sum + tmp;
    }

    System.out.println(sum);

    // close the Scanner object
    input.close();
  }
}
