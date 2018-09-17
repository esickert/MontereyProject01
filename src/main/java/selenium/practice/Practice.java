package selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class Practice   {
    public static void main(String[] erich) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "c://SeleniumDrivers//geckodriver.exe");
        WebDriver driver;
        driver = new FirefoxDriver();

        driver.navigate().to("http://www.yahoo.com");

        Thread.sleep(5000);
        driver.quit();

//888888888888888888888888888888888


    }


}