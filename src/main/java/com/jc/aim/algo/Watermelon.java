package com.jc.aim.algo;

import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/4/A
 */
public class Watermelon {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int w = sc.nextInt();

    if (w % 2 == 0) {
      System.out.println("YES");
    } else {
      System.out.println("No");
    }
  }
}
