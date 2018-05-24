package seleniumTestEnv;


import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class capabilities {

    @Test
    public void openFirefox() {

 //       System.setProperty("Webdriver.driver.FirefoxDriver", "c://SeleniumDrivers//geckodriver.exe");
        System.setProperty("webdriver.gecko.driver","c://SeleniumDrivers//geckodriver.exe");




  //      Map capabilitiesMap = new HashMap();
 //       capabilitiesMap.put("takeScreenShot",true);
 //       DesiredCapabilities capabilities = new DesiredCapabilities(capabilitiesMap);
 //       WebDriver driver = new FirefoxDriver(capabilities);
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        // Take screenshot and store as a file format
        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            // now copy the  screenshot to desired location using copyFile //method
            FileUtils.copyFile(src, new File("C:/tmp/error.png"));
        }

        catch (IOException e)
        {
            System.out.println(e.getMessage());

        }

    }
}
