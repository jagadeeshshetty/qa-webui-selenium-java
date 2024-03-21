package com.jc.playground;

import java.util.Scanner;

public class Test {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    for (int count = N; count > 0; count--) {
      System.out.println(count);
    }
  }
}
