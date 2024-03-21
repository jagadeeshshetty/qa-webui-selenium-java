package com.jc.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo1 {

    public static void main(String[] args) {

        // set up
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.get("http://www.amazon.in");
        List<WebElement> list = driver.findElements(By.xpath("//a"));
        List<String> text = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String tmp = list.get(i).getText();
            text.add(tmp);
        }
        Set<String> removeDuplicates = new HashSet<>(text);
        List<String> listAfterRemovingDuplicates = new ArrayList<>(removeDuplicates);

        for (int i = 0; i < listAfterRemovingDuplicates.size(); i++) {
            System.out.println(listAfterRemovingDuplicates.get(i));
        }

        // tear down
        driver.quit();
    }
}
