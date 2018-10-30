import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice   {
    public static void main(String[] erich) {

        System.setProperty("webdriver.gecko.driver","c://SeleniumDrivers//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.yahoo.com");
      WebElement stuff = driver.findElement(By.cssSelector("#yui_3_18_0_3_1540854298580_818"));
 //       stuff.click();


    }
}

//************