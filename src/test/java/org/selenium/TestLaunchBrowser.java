package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestLaunchBrowser {

    @Test
    void testLaunchBrowser() {
        WebDriver driver = new ChromeDriver();
        System.out.println(driver);
        driver.quit();
    }
}
