package selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class Practice {
    public static void main(String[] aregs) {

        System.setProperty("webdriver.gecko.driver", "c://SeleniumDrivers//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.google.com");
        driver.manage().window().maximize();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Exception");
        }
        WebElement email = driver.findElement(By.className("gb_P"));
        Actions build = new Actions(driver);
        build.contextClick(email)
 //           .sendKeys(Keys.ARROW_DOWN)
//            .sendKeys(Keys.ARROW_DOWN)
                .perform();
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyRelease(KeyEvent.VK_DOWN);
            int x = 0;
            while (x != 9) {
                robot.keyPress(KeyEvent.VK_DOWN);
                robot.keyRelease(KeyEvent.VK_DOWN);
                x++;
            }
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(5000);

        } catch (Exception e) {
            e.printStackTrace();
        }

        driver.quit();


        System.setProperty("webdriver.chrome.driver", "c://SeleniumDrivers//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.yahoo.com");
        driver.manage().window().maximize();

        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
        e.printStackTrace();
        }

//       Select pulldown = new Select();



    }

}
