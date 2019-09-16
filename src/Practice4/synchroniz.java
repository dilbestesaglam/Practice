package Practice4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

public class synchroniz {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/dilbestesaglam/IdeaProjects/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://alaskatrips.poweredbygps.com/g/pt/vacationpackages?MDPCID=ALASKA-US.TPS.BRAND.VACATIONPACKAGES.PACKAGE");
        driver.findElement(By.id("FH-origin")).sendKeys("nyc");
        driver.findElement(By.id("FH-origin")).sendKeys(Keys.TAB);
        Select select = new Select(driver.findElement(By.id("FH-destination")));
        driver.findElement(By.id("FH-destination")).click();
        select.selectByValue("Disneyland");
        driver.findElement(By.id("FH-fromDate")).sendKeys(Keys.ENTER);


        //driver.findElement(By.xpath("//a[contains(@href, 'New-York-Hotels-Day-Hotel')]")).click();*/


    }
}
