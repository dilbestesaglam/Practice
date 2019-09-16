package Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

        //static WebDriver driver = new ChromeDriver();
        public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/dilbestesaglam/IdeaProjects/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://facebook.com");//URL in the browser
        //driver.findElement(By.className("inputtext")).sendKeys("helloworld");
        /*driver.findElement(By.id("email")).sendKeys("This is my first code");
        driver.findElement(By.name("pass")).sendKeys("123456");
        driver.findElement(By.linkText("Forgotten account?")).click();*/
        driver.findElement(By.cssSelector("#email")).sendKeys("emailaddress");
        driver.findElement(By.id("pass")).sendKeys("password");
        driver.findElement(By.linkText("Forgotten account?")).click();






    }

}
