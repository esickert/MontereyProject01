package seleniumDropDowns;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.List;

import static org.openqa.selenium.By.xpath;

public class SeleniumDropDownTests {

    @Test
    public void TestSelect()  {

    // login to Monster website
        System.setProperty("webdriver.chrome.driver", "c://SeleniumDrivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://developer.mozilla.org/en-US/docs/Web/HTML/Element/select");
        driver.manage().window().maximize();





//     WebElement login = driver.findElement(By.cssSelector("#EmailAddress"));
//        login.sendKeys("esickert@gmail.com");
//        WebElement password = driver.findElement(By.cssSelector("#Password"));
//        password.sendKeys("Claude111");
//        driver.findElement(By.cssSelector("#btn-login")).click();  /*

    //open and select options in dropdown menu using the Select class.
//        WebElement dropdown = driver.findElement(By.className("dropdown-menu"));
        WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"wikiArticle\"]/p[14]/select"));
        Select selectOption = new Select(dropdown);      //to use selenium Select class the tags need to be under the select tag
/*****  org.openqa.selenium.support.ui.UnexpectedTagNameException: Element should have been "select" but was "ul"
        Build info: version: '3.4.0', revision: 'unknown', time: 'unknown'
        System info: host: 'TENOCHTITLAN', ip: '192.168.1.100', os.name: 'Windows 7', os.arch: 'amd64', os.version: '6.1', java.version: '1.8.0_144'
        Driver info: driver.version: unknown    ***/
 //       WebElement dropdown = driver.findElement(By.cssSelector("#wikiArticle > p:nth-child(10) > select"));
  //      WebElement dropdown = driver.findElement(By.cssSelector("#wikiArticle > p:nth-child(23) > select"));
//        WebElement dropdown = driver.findElement(By.id("pet-select"));
        //#wikiArticle > p:nth-child(23) > select

        dropdown.click();
        //NOW WE WILL USE THE SELECT TAG ONLY PROBLEM IS DROPDOWN IS UL -> LI
        Select drop = new Select(dropdown);

        try {
            Thread.sleep(3000);
            drop.selectByVisibleText("Third Value");
            Thread.sleep(3000);
            drop.selectByIndex(1);
            Thread.sleep(3000);
            drop.selectByVisibleText("First Value");
        }
        catch(InterruptedException e)
        {
            System.out.println("ERROR");
        }
        WebElement x = drop.getFirstSelectedOption();
        System.out.println("Line 68: " +  x.getText());
        Assert.assertEquals(x.getText(), "First Value");

 //       driver.close();

    }

    @Test
    public void test_ul_li()    {

        System.setProperty("webdriver.chrome.driver", "c://SeleniumDrivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://login20.monster.com/Login/SignIn?re=swoop&ch=MONS&intcid=skr_swoop_h1&r=http%3A%2F%2Fhome.monster.com%2F");
        driver.manage().window().maximize();

        WebElement login = driver.findElement(By.cssSelector("#EmailAddress"));
        login.sendKeys("test@paris.com");
        WebElement password = driver.findElement(By.cssSelector("#Password"));
        password.sendKeys("Paris111");
        driver.findElement(By.cssSelector("#btn-login")).click();


        driver.findElement(By.cssSelector("#mobile-navbar-search > ul > li > a")).click();  //selenium says this element not visible!!!!!!!
        List<WebElement> pulldownOptions = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li"));
            // Loop through the options and select the one that matches

        for (WebElement opt : pulldownOptions ) {
            System.out.println("The option is " + opt.getText());
        }
        pulldownOptions.get(7).click();   //this worked!!!!!!!!!!!!!!!!!!!!   smiley face.
            }
 //           throw new NoSuchElementException("Can't find " + option + " in dropdown");

    }


