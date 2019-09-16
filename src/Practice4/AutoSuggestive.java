package Practice4;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/dilbestesaglam/IdeaProjects/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/"); //URL in the browser
        driver.findElement(By.xpath("//div[2]/div/div[2]/div/div")).click();
        driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div/div[2]/div/div/div/div/div/div/input")).sendKeys("MUM");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']/div/div/p[2]")).click();

        driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/input")).click();
        driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/input")).sendKeys("DEL");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-1']/div/div/p[2]")).click();

    }
}
