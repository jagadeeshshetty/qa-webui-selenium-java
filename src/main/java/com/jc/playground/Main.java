package com.jc.playground;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    StringBuilder str = new StringBuilder("Hello");
    System.out.println(str + " (addr: " + getMem(str) + ")");
    StringBuilder str2 = new StringBuilder("Hello");
    System.out.println(str2 + " (addr: " + getMem(str2) + ")");
  }

  static String getMem(StringBuilder str) {
    return Integer.toHexString(str.hashCode());
  }

}
