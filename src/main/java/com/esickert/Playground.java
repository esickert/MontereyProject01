package com.esickert;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Playground {

@Test
public void factorial() {

    int num = 5;
    int temp = 1;

    while (num > 0) {
        temp = temp * (num--);
        System.out.println(temp);
    }
}
@Test
public void openFirefox()   {
    System.setProperty("webdriver.gecko.driver","c://SeleniumDrivers//geckoDriver.exe");
    WebDriver driver = new FirefoxDriver();

    driver.get("http://www.google.com");

//        driver.manage().window().fullscreen(); //this will fullscreen the window. f11 tp exit
    driver.manage().window().maximize();

    }
}
