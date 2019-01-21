package selenium.practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Practice   {

    @Test
    public void testSelenium()  {

        System.setProperty("webdriver.chrome.driver", "c://SeleniumDrivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        findYahoo(driver);
//        login(driver);

 //*************************************************************************
    }

    public void findYahoo(WebDriver x)  {

        x.get("http://www.yahoo.com");
        x.manage().window().maximize();
        WebElement mail = x.findElement(By.cssSelector("#uh-mail-link"));
        mail.click();
    }

/*   public void login(Webdriver y)  {
        WebElement login = y.findElement(By.cssSelector())

    }  */
}



