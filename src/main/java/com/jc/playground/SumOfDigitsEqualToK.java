package com.jc.playground;

import java.util.Scanner;

// Given a value of N print only those numbers from 1 to N that have sum of digits = K
// N = 30, K = 9
// 1,2,3,4,5,6,7,8, [9] ,10,11,12,13,14,15,16,17, [18] ,19,20,21,22,23,24,25,26, [27] ,28,29,30
public class SumOfDigitsEqualToK {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int N = input.nextInt();
    int K = input.nextInt();

    int sum;

    for (int num = 1; num <= N; num++) {
      sum = 0;
      for (int i = num; i > 0; i = i / 10) {
        int lastDigit = i % 10;
        sum = sum + lastDigit;
      }

      if (sum == K) {
        System.out.println(num);
      }
    }
    // input.close();
  }
}
