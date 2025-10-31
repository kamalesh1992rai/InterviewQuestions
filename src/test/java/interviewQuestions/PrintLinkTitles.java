package interviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PrintLinkTitles {

    public static void main(String[] args){

        // Set up WebDriver (Assuming chromedriver is in PATH)
        WebDriver driver = new ChromeDriver();

        try {
            // open the desired webpage
            driver.get("https://google.com");

            // Find all links on the webpage
            List<WebElement> links = driver.findElements(By.tagName("a"));

            for (int i = 0; i < 10 && i < links.size(); i++) {
                WebElement link = links.get(i);
                System.out.println("Title of link : " + (i + 1) + ": " + link.getText());
            }

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            // close the browser
            driver.quit();
        }
    }
}
