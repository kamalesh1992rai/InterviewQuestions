package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementvsFindElements {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");

        //findElement() --> Return the Single WebElement

        //1
        WebElement searchbox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        searchbox.sendKeys("XYZ");

        //2
        WebElement ele=driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
        System.out.println(ele.getText());

        //3
        WebElement searchButton = driver.findElement(By.xpath("//button[normalize-space()='Search']"));

        //findElements() --> Returns multiple web elements

        //1
        List<WebElement> links=driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
        System.out.println("Number of elements captured: "+links.size());//2

        for (WebElement ele2:links)
        {
            System.out.println(ele2.getText());
        }

        //2
        List<WebElement> logo=driver.findElements(By.xpath("//img[@alt='nopCommerce demo store"));
        System.out.println(logo.size());

        //3
        List<WebElement> elements=driver.findElements(By.xpath("//img[contains(title,'Electronics')]"));
        System.out.println(elements.size()); //0


        driver.quit();

    }
}
