package selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class Practice   {
    public static void main(String[] erich) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "c://SeleniumDrivers//geckodriver.exe");
        WebDriver driver;
        driver = new FirefoxDriver();

        driver.navigate().to("http://www.google.com");

        Thread.sleep(3000);

        WebElement searchBox = driver.findElement(By.cssSelector("#.gLFyf"));

        Actions build = new Actions(driver);
        build.click(searchBox)
             .sendKeys("test")
             .perform();

        Thread.sleep(3000);
//        driver.quit();




    }


}