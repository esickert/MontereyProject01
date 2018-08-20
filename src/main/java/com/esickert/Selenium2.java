package com.esickert;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium2 {

    @Test
    public void TestSelect() {

        // login to Monster website
        System.setProperty("webdriver.chrome.driver", "c://SeleniumDrivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        driver.get("https://developer.mozilla.org/en-US/docs/Web/HTML/Element/select");
        driver.get("https://www.google.com");

        driver.manage().window().maximize();

        Actions build = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#hptl > a:nth-child(2)"));
        build.doubleClick(element).perform();
        //and some more....
    }
}