package com.jc.aim.algo.strings;

public class StringsMemAlloc {

  public static void main(String[] args) {
    String[] strings = { "Hello", "Hello", "Hello", "Hello World", "Hello World!", };

    for (int i = 0; i < strings.length; i++) {
      System.out.println(
          "str" + (i + 1) + " → " + strings[i] + " → " + getMem(strings[i]));
    }

    strings[2] = "Hello World!";
    System.out.println("\nAfter updating str3 value.\n");

    for (int i = 0; i < strings.length; i++) {
      System.out.println(
          "str" + (i + 1) + " → " + strings[i] + " → " + getMem(strings[i]));
    }
  }

  static String getMem(String obj) {
    return Integer.toHexString(obj.hashCode());
  }
}
