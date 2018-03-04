package com.esickert;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static java.lang.Thread.sleep;

public class MontereyProjectCheck {

    @Test
    public void thisIsATest()  {
        System.out.println("This is a test of the new project and POM file");

    }

    @Test
    public void testChrome() throws Exception  {
        System.setProperty("webdriver.chrome.driver","c://SeleniumDrivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://google.com");

        sleep(5000);
        driver.quit();
    }

    @Test
    public void testFirefox() throws Exception   {
        System.setProperty("webdriver.gecko.driver","c://SeleniumDrivers//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.google.com");

        sleep(5000);
        driver.quit();
    }
}
