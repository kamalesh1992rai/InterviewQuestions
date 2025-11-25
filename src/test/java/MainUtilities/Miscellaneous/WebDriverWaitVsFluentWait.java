package MainUtilities.Miscellaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.function.Function;

public class WebDriverWaitVsFluentWait {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void testWithDriverWait() {
        // WebDriverWait (explicit wait)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));

        loginBtn.click();
        System.out.println("Clicked Login button using WebDriverWait");
    }

    @Test
    public void testWithFluentWait() {
        Wait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))  // max wait
                .pollingEvery(Duration.ofMillis(500)) // polling interval
                .ignoring(NoSuchElementException.class); // ignore this exception

        WebElement loginBtn = fluentWait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {
                WebElement element = driver.findElement(By.id("login-button"));
                if (element.isEnabled()) {
                    System.out.println("Login button is enabled");
                    return element;
                }
                return null;
            }
        });

        loginBtn.click();
        System.out.println("Clicked Login button using FluentWait");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
