package selenium.practice;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice   {

@Test
    public void yahoo() {

 //   System.setProperty("webdriver.chrome.driver","c://SeleniumDrivers//chromedriver.exe");
 //   WebDriver driver = new ChromeDriver();

    System.setProperty("webdriver.gecko.driver", "c:\\SeleniumDrivers\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    driver.navigate().to("http://www.yahoo.com");


    }



 //*************************************************This is a test.**********
}





