package com.jc.core.loops;

public class For {
    public static void main(String[] args) {
        // Learning for loop
        For forloop = new For();
        forloop.increment(2);
        forloop.printOnlyOddNumbers(10);
        forloop.printNumbersDivisibleBy2and3();
    }

    private void printNumbersDivisibleBy2and3() {
        for (int i = 1; i < 200; i++) {
            if (i % 2 == 0 || i % 3 == 0)
                System.out.println(i);
        }
    }

    private void printOnlyOddNumbers(int tillWhatNumber) {
        for (int i = 0; i < tillWhatNumber; i++) {
            // Divide number by 2 and checks reminder. If not 0, it is odd number.
            if (i % 2 != 0)
                System.out.println(i);
        }
    }

    void increment(int step) {
        // increment loop with steps
        for (int i = 0; i <= 10; i = i + step) {
            System.out.println(i);
        }
    }

    void increament() {
        // increment loop
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }

    void decrement() {
        // decrement loop
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
