import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/dilbestesaglam/IdeaProjects/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cleartrip.com");
        WebDriverWait wait = new WebDriverWait(driver, 5);


        WebElement fromTag = driver.findElement(By.id("FromTag"));
        fromTag.click();
        fromTag.sendKeys("new");

        driver.findElement(By.id("DepartDate")).click();
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='ui-datepicker-div']/div/table/tbody/tr[2]/td[7]/a")));
        element.click();


        Select select = new Select(driver.findElement(By.id("Adults")));
        select.selectByValue("2");

        Select selectChildren = new Select(driver.findElement(By.id("Childrens")));
        selectChildren.selectByValue("1");

        driver.findElement(By.id("MoreOptionsLink")).click();

        WebElement airlineAutocomplete = driver.findElement(By.id("AirlineAutocomplete"));
        airlineAutocomplete.click();
        airlineAutocomplete.sendKeys("indigo");

        driver.findElement(By.id("SearchBtn")).click();

        System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

    }
}
