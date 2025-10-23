package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BootstrapDropDown {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.hdfcbank.com/");


//        driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
//
//        // ProductTypes
//
//        List<WebElement> productTypes = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
//        System.out.println("Number of options: " + productTypes.size());
//        selectOptionFromDropDown(productTypes,"Accounts");
//
//        // product
//        driver.findElement(By.xpath("//div[@class='drp2']//div[@class='dropdown']")).click();
//
//        List<WebElement> products = driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
//
//        System.out.println("No of options:" + products.size());
//        selectOptionFromDropDown(products, "Savings Accounts");
//
//    }
//
//    public static void selectOptionFromDropDown(List<WebElement> options, String value)
//    {
//
//        for (WebElement product:products)
//        {
//            if (product.getText().equals("Salary Accounts"))
//            {
//                product.click();
//                break;
//            }
//        }
    }
}
