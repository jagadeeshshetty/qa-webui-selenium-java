package com.jc.pom;

public class LoginPage {
    String username;

    void ios() {
        username = "//ios_xpath";
    }

    void android() {
        username = "//android_xpath";
    }

    String printPlatform() {
        return System.getProperty("PLATFORM");
    }
}
