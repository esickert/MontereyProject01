package com.esickert;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.remote.server.handler.SendKeys;

import static java.lang.Thread.sleep;

public class Selenium3 {
    @Test
    public void openPage() throws Exception  {

        System.setProperty("webdriver.gecko.driver","c://SeleniumDrivers//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.dice.com/dashboard");

//        *****************************************LOGiN****************************************************************
        WebElement email = driver.findElement(By.cssSelector("#email"));
        email.click();
        email.sendKeys("esickert@gmail.com");
        WebElement password = driver.findElement(By.cssSelector("#password"));
        password.click();
        password.sendKeys("Claude111");
        password.sendKeys(Keys.ENTER);
        sleep(10);

//     ******************************************DROPDOWN************************************************************
        WebElement Dropdown = driver.findElement(By.cssSelector("#dice-login-customer-name"));
 //       Dropdown.click();



/*        WebElement googleSearch  = driver.findElement(By.cssSelector(".gLFyf"));
        googleSearch.sendKeys("Selenium");
        googleSearch.sendKeys(Keys.ENTER);

        Action build = new Action() {
            @Override
            public void perform() {

            }
        }

        sleep(5000);

        driver.close();     */
    }
}
