package webdriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class SeleniumWebdriver {

    @Test
    public void letsUseChrome() throws Exception{

        System.setProperty("webdriver.chrome.driver","c:/SeleniumDrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com");

        driver.findElement(By.cssSelector("#gbwa > div.gb_Qc > a")).click();
        sleep(5000);
        driver.findElement(By.cssSelector("#gb36 > span.gb_2")).click();

    }

 /*   @Test
    public void letsUseGecko()  {

        System.setProperty(WebDriver.gecko.driver","C://SeleniumDrivers//gecko.exe")
    }*/
}
