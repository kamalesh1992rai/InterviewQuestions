package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements_1 {

    public static void main(String[] args) throws InterruptedException {

        //Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to the test page
        driver.get("https://testautomationpractice.blogspot.com/");

        // 1 TestBox - Enter text
        WebElement nameField = driver.findElement(By.xpath("//input[@id='name']"));
        nameField.sendKeys("kamlesh");
        Thread.sleep(2000);// Wait for 2s

        // 2 Radio Button - Select option
        WebElement maleRadio = driver.findElement(By.xpath("//input[@id='male']"));
        maleRadio.click();

        // 3 Checkbox - Select option
        WebElement mondayCheckbox= driver.findElement(By.xpath("//input[@id='monday']"));
        if (!mondayCheckbox.isSelected())
        {
            mondayCheckbox.click();
        }
        Thread.sleep(2000); // wait for 2s

        // 4 Button -click button
        WebElement submitbutton= driver.findElement(By.xpath("//button[normalize-space()='START']"));
        submitbutton.click();
        Thread.sleep(2000); // wait for 2s

        // 5 Link - Click link
        WebElement homeLink = driver.findElement(By.xpath("//a[normalize-space()='Udemy Courses']"));
        homeLink.click();
        Thread.sleep(2000); // Wait for 2s

        // Close the browser
        driver.quit();

    }
}
