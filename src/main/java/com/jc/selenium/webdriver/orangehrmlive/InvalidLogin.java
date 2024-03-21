package com.jc.selenium.webdriver.orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InvalidLogin {
    public static void main(String[] args) throws InterruptedException {
        // Setup
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        // Test
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        String errorMessage = driver.findElement(By.cssSelector(".oxd-alert-content-text")).getText();

        if (errorMessage.equals("Invalid credentials")) {
            System.out.println("Test is Passed");
        } else {
            System.out.println("Test is Failed");
        }

        // Teardown
        driver.close();
    }
}
