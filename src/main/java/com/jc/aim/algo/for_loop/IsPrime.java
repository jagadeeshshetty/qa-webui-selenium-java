package com.jc.aim.algo.for_loop;

import java.util.Scanner;

public class IsPrime {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number:");
    int N = input.nextInt();
    boolean isPrime = true;

    // 'N-1' is due to the fact that its divisible by itself.
    // To avoid it, we'll skip the number itself.
    for (int num = 2; num < N - 1; num++) {
      if (N % num == 0) {
        isPrime = false;
        break;
      }
    }

    System.out.println(isPrime);

    input.close();
  }
}
