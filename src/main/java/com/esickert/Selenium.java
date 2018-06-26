package com.esickert;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium {

@Test
public void openBrowser()   throws Exception    {

    System.setProperty("webdriver.gecko.driver","c://SeleniumDrivers//geckodriver.exe");
    WebDriver driver = new FirefoxDriver();

    driver.get("https://www.google.com");
//    Thread.sleep(3000);
    driver.manage().window().maximize();
//Note the space in the className. That causes a problem!!!
    WebElement popup = driver.findElement(By.cssSelector("a[class='gb_ed gb_Bd']"));
    popup.click();
// <a class="gb_ed gb_Bd" href="javascript:void(0)" aria-label="Close" title="" data-navigation="server" role="button">×</a>
 //   By.cssSelector("a[class='gb_ed gb_Bd']")      className has a space in it









//    driver.quit();
}
}
