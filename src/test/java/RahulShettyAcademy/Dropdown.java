package RahulShettyAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("http://spicejet.com");
        driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-xb2eav r-majxgm r-q4m81j']")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();



    }
}
