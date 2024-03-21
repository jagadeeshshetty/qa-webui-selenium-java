package com.jc.aim.algo.strings;

public class ValidPalindrome {
  public static void main(String[] args) {
    // String s = "A man, a plan, a canal: Panama";
    // String s = "race a car";
    // String s = " ";
    String s = "ab_A";
    System.out.println(isPalindrome(s));
  }

  static boolean isPalindrome(String s) {
    boolean isPalindrome = true;
    String replacedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    int forwardIndex = 0, backwardIndex = replacedString.length() - 1;
    while (forwardIndex < backwardIndex) {
      if (replacedString.charAt(forwardIndex) != replacedString.charAt(backwardIndex)) {
        isPalindrome = false;
        break;
      }
      forwardIndex++;
      backwardIndex--;
    }
    return isPalindrome;
  }
}
