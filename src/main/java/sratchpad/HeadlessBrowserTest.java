package sratchpad;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.util.logging.Level;

public class HeadlessBrowserTest {
    //Below tests a headless browser

    @Test
    public void headlessBrowserTesing() {
        // below code turns off logging for HtmlUnit
        java.util.logging.Logger.getLogger("com.gargoylesoftware").setLevel(Level.OFF);
        System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");


        //******************************************************************************
        // Declaring and initialising the HtmlUnitWebDriver
        HtmlUnitDriver unitDriver = new HtmlUnitDriver();

        // open google.com webpage
        unitDriver.get("http://google.com");

        System.out.println("Title of the page is -> " + unitDriver.getTitle());

        // find the search edit box on the google page
        WebElement searchBox = unitDriver.findElement(By.name("q"));

        // type in Selenium
        searchBox.sendKeys("Selenium");

        // find the search button
//        unitDriver.findElement(By.name("btnK")).click();
        WebElement button = unitDriver.findElement(By.name("btnK"));

        // Click the button
        button.click();

        System.out.println("Title of the page is -> " + unitDriver.getTitle());
       
        Assert.assertEquals( "Selenium - Google Search", unitDriver.getTitle());

    }
}

