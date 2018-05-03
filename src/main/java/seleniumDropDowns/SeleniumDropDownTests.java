package seleniumDropDowns;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SeleniumDropDownTests {

    @Test
    public void TestSelect() throws InterruptedException {

    // login to Monster website
        System.setProperty("webdriver.chrome.driver", "c://SeleniumDrivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://developer.mozilla.org/en-US/docs/Web/HTML/Element/select");
        driver.manage().window().maximize();

    /*    WebElement login = driver.findElement(By.cssSelector("#EmailAddress"));
        login.sendKeys("esickert@gmail.com");
        WebElement password = driver.findElement(By.cssSelector("#Password"));
        password.sendKeys("Claude111");
        driver.findElement(By.cssSelector("#btn-login")).click();  /*

    //open and select options in dropdown menu using the Select class.
        WebElement dropdown = driver.findElement(By.className("dropdown-menu"));
        Select selectOption = new Select(dropdown);      //to use selenium Select class the tags need to be under the select tag
/*****  org.openqa.selenium.support.ui.UnexpectedTagNameException: Element should have been "select" but was "ul"
        Build info: version: '3.4.0', revision: 'unknown', time: 'unknown'
        System info: host: 'TENOCHTITLAN', ip: '192.168.1.100', os.name: 'Windows 7', os.arch: 'amd64', os.version: '6.1', java.version: '1.8.0_144'
        Driver info: driver.version: unknown    ***/
        WebElement dropdown = driver.findElement(By.cssSelector("#wikiArticle > p:nth-child(10) > select"));

//        dropdown.click();
        Select drop = new Select(dropdown);
        Thread.sleep(3000);
        drop.selectByVisibleText("Value 3");
        Thread.sleep(3000);
        drop.selectByIndex(1);
        Thread.sleep(3000);
        drop.selectByVisibleText("Value 1");

        WebElement x = drop.getFirstSelectedOption();
        System.out.println(x.getText());
        Assert.assertEquals(x.getText(), "Value 1");

        driver.close();
    }

    public void test_ul_li()    {

        System.setProperty("webdriver.chrome.driver", "c://SeleniumDrivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://developer.mozilla.org/en-US/docs/Web/HTML/Element/select");
        driver.manage().window().maximize();

            driver.findElement(By.className("dropdown-menu")).click();
            // Get all of the options
            List<WebElement> options = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li"));
            // Loop through the options and select the one that matches
            for (WebElement opt : options) {
     //           if (opt.getText().equals(option)) {
                    opt.click();
                    return;
                }
            }
 //           throw new NoSuchElementException("Can't find " + option + " in dropdown");

    }

//}
