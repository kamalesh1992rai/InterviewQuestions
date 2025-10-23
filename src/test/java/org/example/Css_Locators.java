package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Locators {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        // using ID, also can write(tagname#id) "tagname is optional"
        Boolean check= driver.findElement(By.cssSelector("#name")).isDisplayed();
        System.out.println(check);

        // Using Classname (write classname with starting with '.'{dot} or (tagname.classname) "tagname is optinal"
        Boolean check2= driver.findElement(By.cssSelector(".form-control")).isDisplayed();
        System.out.println(check2);

        // using attribute value also we can write with Tagname "tagname is optinal"

        Boolean check3 = driver.findElement(By.cssSelector("[placeholder='Enter Name']")).isDisplayed();
        System.out.println(check3);

        // Using Tag Class and Attribute (use when 2 elements have same tag and class name)
        Boolean check4= driver.findElement(By.cssSelector("input.form-control[placeholder='Enter Phone']")).isDisplayed();
        System.out.println(check4);

        driver.quit();


    }
}
