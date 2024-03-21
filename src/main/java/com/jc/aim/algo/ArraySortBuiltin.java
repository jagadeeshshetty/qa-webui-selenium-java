package com.jc.aim.algo;

import java.util.Arrays;

public class ArraySortBuiltin {

  public static void main(String[] args) {
    int[] intArray = new int[5];
    intArray[0] = 35;
    intArray[1] = 10;
    intArray[2] = (int) 5.25; // narrowing typecasting
    intArray[3] = 15;
    intArray[4] = 2;

    System.out.println("Before Sorting: " + Arrays.toString(intArray));

    Arrays.sort(intArray);

    System.out.println("After Sorting:  " + Arrays.toString(intArray));
  }
}
