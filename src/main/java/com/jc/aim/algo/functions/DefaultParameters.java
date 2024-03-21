package com.jc.aim.algo.functions;

/*
 * By default Java doesn't support default parameters.
 */
public class DefaultParameters {
  public static void main(String[] args) {
    int result = add(1, 2);
    System.out.println(result);
  }

  static int add(int a, int b) {
    return a + b;
  }
}
