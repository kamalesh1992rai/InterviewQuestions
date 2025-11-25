package MainUtilities.Miscellaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumLocators {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");

        // 1. id
        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");

        // 2. name
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        // 3. className
        WebElement loginBtn = driver.findElement(By.className("submit-button"));
        loginBtn.click();

        // 4. tagName
        WebElement firstTitle = driver.findElements(By.tagName("sapn")).get(0);
        System.out.println("Page Heading: " + firstTitle.getText());

        // 5. linkText
        WebElement twitterElement = driver.findElement(By.linkText("Twitter"));
        System.out.println("Twitter link: " + twitterElement.getAttribute("href"));

        // 6. partialLinkText
        WebElement facebookElement = driver.findElement(By.partialLinkText("Face"));
        System.out.println("Facebook link: " + facebookElement.getAttribute("href"));

        // 7. cssSelector
        WebElement menuBtn = driver.findElement(By.cssSelector("#react-burger-menu-btn"));
        menuBtn.click();

        // 8. xpath
        WebElement logoutLink = driver.findElement(By.xpath("//a[text()='Logout']"));
        logoutLink.click();

        driver.quit();

    }
}
