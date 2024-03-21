package com.jc.core.conditions;

public class FidMaxNumber {
    // Find the max of three numbers.

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        if (a > b && a > c) {
            System.out.println("a is bigger. value = " + a);
        } else if (b > c) {
            System.out.println("b is bigger. value = " + b);
        } else {
            System.out.println("c is bigger. value = " + c);
        }
    }
}
