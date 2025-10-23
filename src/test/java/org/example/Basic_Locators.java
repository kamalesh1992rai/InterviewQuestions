package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Locators {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        //Finding Element By id
        Boolean check=false;
        check=driver.findElement(By.id("name")).isDisplayed();
        System.out.println(check);

        //Finding Element By Name
        Boolean check2 = false;
        check2 = driver.findElement(By.name("SelectedDate")).isDisplayed();
        System.out.println(check2);

        //Finding Element By Link Text and Clicking in it
        driver.findElement(By.linkText("Udemy Courses")).click();

        //Finfing Element By Partial Link Text and Clicking on it
        driver.findElement(By.partialLinkText("SDET-QA (You")).click();


        driver.quit();

    }



}
