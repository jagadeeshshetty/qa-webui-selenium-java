package com.jc.selenium.webdriver.orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class ValidLoginRunThroughDocker {
    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        // Setup
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"), capabilities);

        // Test
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(4000);
        WebElement dashboardHeader = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
        System.out.println(dashboardHeader.getText());

        // Teardown
        driver.close();
        driver.quit();
    }
}
