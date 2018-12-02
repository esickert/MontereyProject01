package selenium.practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Practice   {

    @Test
    public void testSelenium()  {

        System.setProperty("webdriver.gecko.driver", "c://SeleniumDrivers//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        findYahoo(driver);
        login();
    }

    public void findYahoo(WebDriver x)  {

        x.get("http://www.yahoo.com");
        WebElement mail = x.findElement(By.cssSelector("#uh-mail-link"));
        mail.click();
    }



}



