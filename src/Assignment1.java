import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/dilbestesaglam/IdeaProjects/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

        Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
        Assert.assertFalse(driver.findElement(By.id("checkBoxOption2")).isSelected());
        Assert.assertFalse(driver.findElement(By.id("checkBoxOption3")).isSelected());

        driver.findElement(By.id("checkBoxOption1")).click();
        driver.findElement(By.id("checkBoxOption2")).click();
        driver.findElement(By.id("checkBoxOption3")).click();

        Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
        Assert.assertTrue(driver.findElement(By.id("checkBoxOption2")).isSelected());
        Assert.assertTrue(driver.findElement(By.id("checkBoxOption3")).isSelected());


    }
}
