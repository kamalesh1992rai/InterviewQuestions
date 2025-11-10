package RahulShettyAcademy;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class Miscelleanous {

    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8130761095");
        driver.manage().deleteAllCookies();

        int a = 5;



    }

}
