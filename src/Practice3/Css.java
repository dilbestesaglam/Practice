package Practice3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Css {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/Users/dilbestesaglam/IdeaProjects/geckodriver" );
        WebDriver driver = new FirefoxDriver();
        driver.get("https://login.salesforce.com/");
        driver.findElement(By.cssSelector("input[id='username']")).sendKeys("fewrew");
        driver.findElement(By.cssSelector("input[id='password']")).sendKeys("fsdfsd");
        driver.findElement(By.id("Login")).click();
        driver.findElement(By.cssSelector("#Login"));

    }
}
