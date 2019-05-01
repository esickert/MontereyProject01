package com.esickert;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.remote.server.handler.SendKeys;

import static java.lang.Thread.sleep;

public class Selenium3 {
    @Test
    public void openPage() throws Exception  {

        System.setProperty("webdriver.gecko.driver","c://SeleniumDrivers//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.google.com");

        WebElement googleSearch  = driver.findElement(By.cssSelector(".gLFyf"));
        googleSearch.sendKeys("Paul Sickert");
        googleSearch.sendKeys(Keys.ENTER);

        sleep(5000);

        driver.close();
    }
}
