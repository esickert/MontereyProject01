package selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
;
//NOTE: THIS SELENIUM IS SETUP TO RUN IN LINUX 14.04
public class Practice   {
    public static void main(String[] erich) {

        System.setProperty("webdriver.chrome.driver","c://SeleniumDrivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.yahoo.com");

        WebElement stuff = driver.findElement(By.cssSelector("#yui_3_18_0_3_1540854298580_818"));
 //       stuff.click();


    }
}

//****