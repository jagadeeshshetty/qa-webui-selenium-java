package com.jc.aim.algo;

public class LinearSearch {

  public static void main(String[] args) {
    int[] numbers = { 86, 91, 34, 50, 0 };

    System.out.println(
      "Should return 1 when search for 50 integer. " + linearSearch(numbers, 50)
    );

    System.out.println(
      "Should return 0 when search for 10 integer. " + linearSearch(numbers, 10)
    );
  }

  /**
   * Searches for a specific integer in an array using linear search.
   *
   * Time complexity: O(n)
   *
   * This function iterates through the given array of integers and checks if the
   * expected number is present in the array. If the expected number is found, it
   * returns 1; otherwise, it returns 0 to indicate that the expected number is not
   * present in the array.
   *
   * @param numbers         The array of integers to search within.
   * @param expectedNumber  The integer to search for in the array.
   * @return                1 if the expected number is found; otherwise, 0.
   */
  public static int linearSearch(int[] numbers, int expectedNumber) {
    for (int i = 1; i < numbers.length; i++) {
      // If expected number is present, return 1.
      if (numbers[i] == expectedNumber) return 1;
    }

    // If expected number is not present, return 0.
    return 0;
  }
}
