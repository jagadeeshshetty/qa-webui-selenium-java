package com.jc.aim.algo.for_loop;

public class Empty {

  public static void main(String[] args) {
    int num = 5;

    int i = 0;

    for (;;) {
      if (i >= num) break;
      i++;
      System.out.println(i);
    }
  }
}
