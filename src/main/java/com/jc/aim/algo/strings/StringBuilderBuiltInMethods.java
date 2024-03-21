package com.jc.aim.algo.strings;

public class StringBuilderBuiltInMethods {
  public static void main(String[] args) {
    StringBuilder str = new StringBuilder("Hello");
    System.out.println("Actual str → " + str);

    System.out.println("Char at 0 index → " + str.charAt(0));
    str.setCharAt(0, 'h');
    System.out.println("After updating 'H' with 'h' character → " + str);

    System.out.println("Capacity of the str → " + str.capacity());
  }
}
