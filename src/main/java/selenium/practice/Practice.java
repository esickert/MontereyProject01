package selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice   {
    public static void main(String[] eric)  {

        System.setProperty("webdriver.chrome.driver","c://SeleniumDrivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.yahoo.com");

        driver.manage().window().maximize();

        try {
            Thread.sleep(5000);
        }
        catch(Exception e)   {
            e.printStackTrace();
        }

        driver.close();


    }
}

