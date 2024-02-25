package com.esickert;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Selenium2 {

    @Test
    public void TestSelect() {

        // login to Monster website
        System.setProperty("webdriver.chrome.driver", "//home//esickert//SeleniumDrivers//chromedriver");
        WebDriver driver = new ChromeDriver();
//        driver.get("https://developer.mozilla.org/en-US/docs/Web/HTML/Element/select");
        driver.get("https://www.google.com");

        driver.manage().window().maximize();

        Actions build = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#gbwa > div.gb_Pc > a")); //not sure what this is clicking on?
 //       element.click();
        WebElement element2 = driver.findElement(By.cssSelector("#gb36 > span.gb_W"));
        build.click(element)
             .contextClick()
             .perform();
        //and some more..
        driver.close();
    }
}

