package com.esickert;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium {

@Test
public void openBrowser()       {

    System.setProperty("webdriver.gecko.driver","c://SeleniumDrivers//geckodriver.exe");
    WebDriver driver = new FirefoxDriver();

    driver.get("https://www.google.com");
    try {
        Thread.sleep(3000);

    }
    catch(InterruptedException e)
    {
       e.printStackTrace();          // REMEMBER<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    }
    driver.manage().window().maximize();
//    Note the space in the className. That causes a problem!!!
//    WebElement popup = driver.findElement(By.cssSelector("a[class='gb_ed gb_Bd']"));
//    popup.click();
// <a class="gb_ed gb_Bd" href="javascript:void(0)" aria-label="Close" title="" data-navigation="server" role="button">×</a>
//   By.cssSelector("a[class='gb_ed gb_Bd']")                   className has a space in it
//    System.out.println(3/0);  experimenting with devide by zero. Throughs a arimetic exception.
    try {
        System.out.println("This doesn't this trow anb exception??? " + 3.0 / 0);  // prints out "infinity".  ?????????????????????????????????
    }
    catch (ArithmeticException e)
    {
            e.printStackTrace();    //REMEMBER  <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    }

    System.out.println(driver.getTitle());
    Assert.assertTrue("Are they equal", driver.getTitle().equals("Google"));









//    driver.quit();
}
}
