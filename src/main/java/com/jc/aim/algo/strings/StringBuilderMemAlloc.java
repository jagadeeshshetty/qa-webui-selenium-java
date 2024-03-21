package com.jc.aim.algo.strings;

public class StringBuilderMemAlloc {
  public static void main(String[] args) {
    StringBuilder str1 = new StringBuilder("Hello");
    System.out.println(str1 + " (addr: " + getMem(str1) + ")");

    StringBuilder str2 = new StringBuilder("Hello");
    System.out.println(str2 + " (addr: " + getMem(str2) + ")");

    // New memory addr is not get create for str3 variable.
    // The append method adds a new string to the end of the existing str1 memory addr.
    // So str3 points to same memory addr as str1 variable.
    StringBuilder str3 = str1.append(" World!");
    System.out.println(str3 + " (addr: " + getMem(str3) + ")");
  }

  static String getMem(StringBuilder str) {
    return Integer.toHexString(str.hashCode());
  }

}
