package interview.questions;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumQuestions {


 //   public WebDriver fireFoxDriver() {
 //       System.setProperty("webdriver.gecko.driver", "C://SeleniumDrivers//geckodriver.exe");
 //       WebDriver driver = new FirefoxDriver();
 //       return driver;
 //   }

    public WebDriver chromeDriver() {
        System.setProperty("webdriver.chrome.driver","home//esickert//SeleniumDrivers//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;

    }

 /*   @Test
    public void openFireFox() {

        fireFoxDriver().get("http://www.google.com");
    }
*/
    @Test
    public void openChrome()    {

        chromeDriver().get("http://www.yahoo.com");

    }

}


