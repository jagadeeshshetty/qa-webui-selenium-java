package com.jc.selenium.webdriver.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest {
    public static void main(String[] args) {

        // setup
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.navigate().to("https://jqueryui.com/droppable/");

        // Switch to the iFrame
        WebElement demoFrame = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(demoFrame);


        WebElement draggableElement = driver.findElement(By.id("draggable"));
        WebElement droppableElement = driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);

        actions.clickAndHold(draggableElement).moveToElement(droppableElement).release().build().perform();

        // Switch back to the main page
        driver.switchTo().defaultContent();

        // teardown
        driver.close();
    }
}
