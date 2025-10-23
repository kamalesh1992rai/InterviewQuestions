package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandleMultipleDropDowns {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.orangehrm.com/orangegrm-30-day-trial/");

        //Approach 1

//        Select noOfEmpsdrp= new Select(driver.findElement(By.name("NoofEmployees")));
//        noOfEmpsdrp.selectByVisibleText("16-20");
//
//        Select industryDrp = new Select(driver.findElement(By.name("Industry")));
//        industryDrp.selectByVisibleText("Travel");
//
//        Select countryDrp = new Select(driver.findElement(By.name("Country")));
//        countryDrp.selectByVisibleText("Aruba");

        //Approach 2
//        WebElement noOfEmpsEle=driver.findElement(By.name("NoOfEmployees"));
//        selectOptionFromDropDown(noOfEmpsEle,"16-20");
//
//        WebElement industryEle=driver.findElement(By.name("Industry"));
//        selectOptionFromDropDown(industryEle,"Healthcare");
//
//        WebElement country = driver.findElement(By.name("Country"));
//        selectOptionFromDropDown(country,"Ghana");
//    }
//
//    public static void selectOptionFromDropDown(WebElement ele, String value)
//    {
//        Select drp=new Select(ele);
//        List<WebElement>alloptions=drpCountry.getOptions();
//        for (WebElement options:alloptions)
//        {
//            if (option.getText().equals("Cuba"))
//            {
//                options.click();
//                break;
//            }
//        }
    }



}
