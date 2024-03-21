package com.jc.aim.algo.for_loop;

import java.util.Scanner;

public class PrintPrimeNum {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number:");
    int N = input.nextInt();

    for (int num = 2; num <= N; num++) {
      if (isPrime(num)) {
        System.out.println(num);
      }
    }

    input.close();
  }

  private static boolean isPrime(int N) {
    boolean isPrime = true;
    for (int num = 2; num < N - 1; num++) {
      if (N % num == 0) {
        isPrime = false;
        break;
      }
    }
    return isPrime;
  }
}
