package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        // Create driver instance
        WebDriver driver = new ChromeDriver();

        // Launch website
        driver.get("https://www.google.com");

        // Print title
        System.out.println("Page title: " + driver.getTitle());

        // Locate element and interact
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium WebDriver");
        searchBox.submit();

        // Wait briefly
        try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }

        // Close browser
        driver.quit();
    }
}

