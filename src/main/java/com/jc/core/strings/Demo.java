package com.jc.core.strings;

public class Demo {
    public static void main(String[] args) {
        String str = "Dynamic XPath | Method Overloading | Manipulating String | Sharing Java Project";

        System.out.println(str);
        System.out.println("equals: " + str.equals("Dynamic XPath"));
        System.out.println("equalsIgnoreCase: " + str.equalsIgnoreCase("dynamic xpath | method overloading | manipulating string | sharing java project"));
        System.out.println("toUpperCase: " + str.toUpperCase());
        System.out.println("toLowerCase: " + str.toLowerCase());
        System.out.println("charAt(0): " + str.charAt(0));
        System.out.println("length(): " + str.length());
        System.out.println("concat(): " + str.concat(" \uD83D\uDE80"));
        System.out.println("contains(): " + str.contains("XPath"));
    }
}
