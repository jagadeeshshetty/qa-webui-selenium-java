package com.jc.pom;

public class Test {
    public static void main(String[] args) {
        System.setProperty("PLATFORM", "IOS");
//        final String PLATFORM = "IOS";
//        final String PLATFORM = "ANDROID";

        // Test case
        System.out.println("Running Test");
        LoginPage loginPage = new LoginPage();

        System.out.println(loginPage.username);
        System.out.println(loginPage.printPlatform());
    }
}
