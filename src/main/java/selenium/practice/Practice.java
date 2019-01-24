package selenium.practice;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice   {

@Test
    public void yahoo() {

    System.setProperty("webdriver.chrome.driver","c://SeleniumDrivers//chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://www.yahoo.com");


    }



 //*************************************************************************
}





