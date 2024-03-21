package com.jc.aim.algo.strings;

import java.util.Scanner;

public class IsPalindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the string: ");
    String str = sc.next();
    boolean isPalindrome = true;

    int forwardIndex = 0, backwardIndex = str.length() - 1;

    while (forwardIndex < backwardIndex) {
      if (str.charAt(forwardIndex) != str.charAt(backwardIndex)) {
        isPalindrome = false;
        break;
      }

      forwardIndex++;
      backwardIndex--;
    }

    System.out.println("Is '" + str + "' palindrome? " + isPalindrome);
    
  }
}
