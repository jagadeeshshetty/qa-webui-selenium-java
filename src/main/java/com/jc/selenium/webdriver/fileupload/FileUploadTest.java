package com.jc.selenium.webdriver.fileupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileUploadTest {
    public static void main(String[] args) throws InterruptedException {

        // setup
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        driver.navigate().to("https://demo.guru99.com/test/upload/");
        WebElement chooseFile = driver.findElement(By.id("uploadfile_0"));
        chooseFile.sendKeys(System.getProperty("user.dir") + "/src/main/java/com/jc/selenium/webdriver/fileupload/test-upload.txt");

        Thread.sleep(5000);

        // teardown
        driver.close();
    }
}
