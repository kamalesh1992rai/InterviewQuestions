package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Commands {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        //Make window Full Screen
        driver.manage().window().maximize();

        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        Thread.sleep(1000);

        //Navigate to New Web Page
        driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
        Thread.sleep(1000);

        //Navigate Back to Original WebPage
        driver.navigate().back();
        Thread.sleep(1000);

        //Again go back to second webpage
        driver.navigate().forward();
        Thread.sleep(1000);

        //Refresh WebPage
        driver.navigate().refresh();
        driver.quit();
    }
}
