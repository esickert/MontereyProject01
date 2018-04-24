package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

    System.setProperty("WebDriver.chrome.driver","c:\\SeleniumDrivers\\chromeDriver.exe");
    WebDriver driver = new ChromeDriver();

    driver.get("http:www.google.com");
    WebElement element = driver.findElement(By.cssSelector("q"));
    element.click();
}
