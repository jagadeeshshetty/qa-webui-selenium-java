package com.jc.core.userinput;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    System.out.println("What's your age?");

    // steps to take input value
    Scanner input = new Scanner(System.in);
    int age = input.nextInt();

    System.out.println("Age is: " + age);

    input.close();
  }
}
