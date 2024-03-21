package com.jc.selenium.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LaunchDifferentBrowsers {

    public static void main(String[] args) {
        // set up
        BrowserName browser = BrowserName.CHROME;
        WebDriver driver;

        switch (browser) {
            case CHROME:
                driver = new ChromeDriver();
                break;
            case EDGE:
                driver = new EdgeDriver();
                break;
            case SAFARI:
                driver = new SafariDriver();
                break;
            case FF:
                driver = new FirefoxDriver();
                break;
            case IE:
                driver = new InternetExplorerDriver();
                break;
            default:
                driver = new ChromeDriver();
                System.out.println("No browser specified. Using default Chrome browser.");
                break;
        }

        driver.navigate().to("http://www.amazon.in");
        String title = driver.getTitle();
        System.out.println("Title: " + title);

        // tear down
        driver.quit();
    }

    enum BrowserName {
        SAFARI, EDGE, FF, CHROME, IE, OPERA
    }
}
