import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

    @Test
    public void openChrome()    {
        System.setProperty("webdriver.chrome.driver","c:\\seleniumDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.bing.com");

    }

}
