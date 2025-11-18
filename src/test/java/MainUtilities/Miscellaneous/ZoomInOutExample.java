package MainUtilities.Miscellaneous;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ZoomInOutExample {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void zoomInAndOut() throws InterruptedException{
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Zoom In
        js.executeScript("document.body.style.zoom='150%'");
        Thread.sleep(2000);

        //Zoom Out
        js.executeScript("document.body.style.zoom='50%'");
        Thread.sleep(2000);

        //Reset to 100%
        js.executeScript("document.body.style.zoom='100%'");
        Thread.sleep(2000);
    }

}
