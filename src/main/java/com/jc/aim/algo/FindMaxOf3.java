package com.jc.aim.algo;

import java.util.Scanner;

public class FindMaxOf3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int first = sc.nextInt();
    int second = sc.nextInt();
    int third = sc.nextInt();
    sc.close();

    // 55 45 35, 10 10 4
    if (first > second && first > third) {
      System.out.println(first);
    } else if (second > first && second > third) {
      System.out.println(second);
    } else {
      System.out.println(third);
    }
  }
}
