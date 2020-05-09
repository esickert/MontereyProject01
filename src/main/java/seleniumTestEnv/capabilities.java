package seleniumTestEnv;


import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class capabilities {

    @Test
    public void openFirefox() throws Exception  {

 //       System.setProperty("Webdriver.driver.FirefoxDriver", "c://SeleniumDrivers//geckodriver.exe");
        System.setProperty("webdriver.gecko.driver","c://SeleniumDrivers//geckodriver.exe");



//************************************

  //      Map capabilitiesMap = new HashMap();
 //       capabilitiesMap.put("takeScreenShot",true);
 //       DesiredCapabilities capabilities = new DesiredCapabilities(capabilitiesMap);
 //       WebDriver driver = new FirefoxDriver(capabilities);
        WebDriver driver = new FirefoxDriver();

        driver.get("https://esickert.github.io");

        driver.manage().window().maximize();

        WebElement stuff = driver.findElement(By.className("silly"));
        System.out.println("This is the text being modified by style class 'silly': " + stuff.getText());

        // Take screenshot and store as a file format
        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            // now copy the  screenshot to desired location using copyFile //method
            FileUtils.copyFile(src, new File("C:/tmp/screenShot.png"));
        }

        catch (IOException e)
        {
            System.out.println(e.getMessage());

        }
        Thread.sleep(3000);
        driver.quit();

    }
}
