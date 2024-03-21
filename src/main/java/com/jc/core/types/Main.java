package com.jc.core.types;

public class Main {

    // public static void main(String[] args) {
    // final byte MONTHS_IN_YEAR = 12;
    // final byte PERCENT = 100;
    //
    // Scanner scanner = new Scanner(System.in);
    //
    // System.out.print("Principal: ");
    // int principal = scanner.nextInt();
    //
    // System.out.print("Annual Interest Rate: ");
    // float annualInterest = scanner.nextFloat();
    // float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
    //
    // System.out.print("Period (Years): ");
    // byte years = scanner.nextByte();
    // int numberOfPayments = years * MONTHS_IN_YEAR;
    //
    // double mortgage = principal
    // * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
    // / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    //
    // String mortgageFormatted =
    // NumberFormat.getCurrencyInstance().format(mortgage);
    // System.out.println("Mortgage: " + mortgageFormatted);
    // }

    public static void main(String[] args) {
        // The 'byte' data type takes 1 Byte of memory and can store values from -127,
        // +128 range.
        byte date = 28;
        // As 2023 exceeds 128 value, we need to use 'short' data type which takes
        // 2 Byte of memory and can store values from -32K, +32K range.
        short year = 2023;
        short _32K = 32_000;
        // As 33K exceeds 32K value, we need to use 'int' data type which takes 4 Byte
        // of memory and can store values from -2B, +2B range.
        int _33K = 33_000;
        int _2B = 2_000_000_000;
        // As 3B exceeds 2B value, we need to use 'long' data type which takes 8 Byte of
        // memory and can store values from TBD to TBD range.
        long _3B = 3_000_000_000L;
        // Similar to 'int', it takes 4 Byte of memory.
        float priceF = 10.02F;
        // Similar to 'long', it takes 8 Byte of memory.
        double price = 10.02;
        char letter = 'a';
        boolean isPresent = true;
    }

}
