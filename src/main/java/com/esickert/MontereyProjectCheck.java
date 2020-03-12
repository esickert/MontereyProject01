package com.esickert;

import org.apache.commons.validator.UrlValidator;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;

import static java.lang.Thread.sleep;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MontereyProjectCheck {

    @Test
    public void thisIsATest()  {
        System.out.println("This is a test of the new project and POM file");
    }

    @Test
    public void checkChrome() throws Exception  {
        System.setProperty("webdriver.chrome.driver","c://SeleniumDrivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://google.com");

        sleep(5000);
        driver.quit();
    }

    @Test
    public void checkFirefox() throws Exception   {
        System.setProperty("webdriver.gecko.driver","c://SeleniumDrivers//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.google.com");

        //I don't know what these are ?????????????????  urlValidator
 //       UrlValidator urlValidator = new UrlValidator();
 //n       System.out.println(urlValidator.isValid("http://my favorite site!"));

        sleep(5000);
        driver.quit();


    }

    @Test
    public void checkJunit()    {
        int x = 3;
        int y = 3;
        assertThat(x+y, is(6));
    }
//***************************************************************************
    @Test  // note that in both cases third option is "driver" in "webdriver.chrome.driver".
    public void testSeleniumChrome() throws Exception   {
        System.setProperty("webdriver.chrome.driver","c://SeleniumDrivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");

        Thread.sleep(3000);
        driver.quit();
    }
}
