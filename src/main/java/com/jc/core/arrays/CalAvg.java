package com.jc.core.arrays;

/**
 * Calculate Average Using Arrays
 * Link: <a href="https://www.programiz.com/java-programming/examples/average-arrays">...</a>
 * <p>
 * What I learn?
 * Java Arrays
 * Java for-each Loop
 */
public class CalAvg {
    public static void main(String[] args) {
        double[] numbers = {45.3, 67.5, -45.6, 20.34, 33.0, 45.6};
        double sum = 0.0;

        for (double i : numbers) {
            sum += i;
        }

        double avg = sum / numbers.length;
        System.out.format("Average: %.2f", avg);
    }
}
