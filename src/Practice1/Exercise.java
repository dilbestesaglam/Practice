package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.Set;

public class Exercise {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/dilbestesaglam/IdeaProjects/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signup");
        driver.findElement(By.xpath("//div[@id='initialView']/footer/ul/li/a")).click();
        System.out.println("Before Switching");
        System.out.println(driver.getTitle());
        Set<String>ids=driver.getWindowHandles();
        Iterator<String> it=ids.iterator();
        String parentid=it.next();
        String childid=it.next();
        driver.switchTo().window(childid);
        System.out.println("After Switching");
        System.out.println(driver.getTitle());
        driver.switchTo().window(parentid);
        System.out.println("Switching back to parent");
        System.out.println(driver.getTitle());







    }

}
