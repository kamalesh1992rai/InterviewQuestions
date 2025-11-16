package RahulShettyAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Scope {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");

        // 1. Give me the count of links on the page
        System.out.println(driver.findElements(By.tagName("a")).size());
        WebElement footerdriver = driver.findElement(By.id("gf-BIG"));

        // 2. Count of footer section
        System.out.println(footerdriver.findElements(By.tagName("a")).size());

        // 3.
        WebElement columndriver=driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(columndriver.findElements(By.tagName("a")).size());

        // 4. click on each link in the column and if the pages are opening
        for (int i=1;i<columndriver.findElements(By.tagName("a")).size();i++){

            String clickonlinkTab= Keys.chord(Keys.CONTROL,Keys.ENTER);
            columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);

            Set<String> abc = driver.getWindowHandles();
            Iterator<String> it = abc.iterator();
            while (it.hasNext())
            {
                driver.switchTo().window(it.next());
                System.out.println(driver.getTitle());
            }

        }
    }
}
