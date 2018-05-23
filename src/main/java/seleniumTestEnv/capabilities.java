package seleniumTestEnv;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;

public class capabilities {

    @Test
    public void openFirefox() {

 //       System.setProperty("Webdriver.driver.FirefoxDriver", "c://SeleniumDrivers//geckodriver.exe");
        System.setProperty("webdriver.gecko.driver","c://SeleniumDrivers//geckodriver.exe");




        Map capabilitiesMap = new HashMap();
        capabilitiesMap.put("takeScreenShot",true);
        DesiredCapabilities capabilities = new DesiredCapabilities(capabilitiesMap);
        WebDriver driver = new FirefoxDriver(capabilities);

        driver.get("https://www.google.com");

    }
}
