package com.esickert;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium2 {

    @Test
    public void TestSelect() {

        // login to Monster website
        System.setProperty("webdriver.chrome.driver", "c://SeleniumDrivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        driver.get("https://developer.mozilla.org/en-US/docs/Web/HTML/Element/select");
        driver.get("http:esickert.github.io");
        if ((driver.getPageSource().contains("it")))
            System.out.println("Found it");
        if (driver.getPageSource().contains("Click"))
            System.out.println("Clickme");
        driver.manage().window().maximize();

    }
}