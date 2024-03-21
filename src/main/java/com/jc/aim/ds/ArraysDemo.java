package com.jc.aim.ds;

import java.util.Arrays;

public class ArraysDemo {

  public static void main(String[] args) {
    System.out.println("Program starts...");

    int[] intArray = new int[5];

    // Implicit call to 'toString()' on array 'intArray'.
    System.out.println("intArray: " + intArray); // 🖥→ intArray: [I@531d72ca
    System.out.println("intArray: " + Arrays.toString(intArray)); // 🖥→ intArray: [0, 0, 0, 0, 0]

    System.out.println("array size: " + intArray.length); // 🖥️→ array size: 5

    System.out.println("1st elemnet: " + intArray[0]);
    System.out.println("2nd elemnet: " + intArray[1]);
    System.out.println("------------------------------");

    System.out.println("Array element using for loop.");
    for (int i = 0; i < intArray.length; i++) {
      System.out.println(i + " element is: " + intArray[i]);
    }
    System.out.println("------------------------------");

    intArray[0] = 10;
    intArray[1] = 20;
    intArray[2] = 30;
    intArray[3] = 40;
    intArray[4] = 50;

    System.out.println("Array element using for each loop.");
    for (int i : intArray) {
      System.out.println(i);
    }
    System.out.println("------------------------------");

    System.out.println("Program completes...");
  }
}
