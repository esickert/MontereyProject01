package selenium.practice;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice   {

    @Test
    public void testSelenium()  {

        System.setProperty("webdriver.gecko.driver", "c://SeleniumDrivers//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.yahoo.com");
    }

}



