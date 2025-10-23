package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Get_Commands {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        // get() method

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);

        // getTitle() method
        String title = driver.getTitle();
        System.out.println(title);

        // getURL() method
        String url = driver.getCurrentUrl();
        System.out.println();

        // getPageSource
        String source = driver.getPageSource();
        System.out.println(source);

        // getWindowHandle() of first page
        String originalhandle = driver.getWindowHandle();
        System.out.println("First Window Handel" + originalhandle);

        // Open second URL in Another Window
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://testautomationpractice.blogspot.com/");

        // getWindowHandles() of both the pages (return set of string due to unique id)
        Set<String> windowid = driver.getWindowHandles();
        System.out.println(windowid);

        // Switching back to Original Page
        driver.switchTo().window(originalhandle);

        driver.quit();



    }
}
