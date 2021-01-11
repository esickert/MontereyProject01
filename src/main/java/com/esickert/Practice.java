package com.esickert;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.ws.WebEndpoint;
import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class Practice  {

    @Test
    public void toFile()   {
        String filename = "c://tmp//erich.txt";
        try {
            PrintStream in = new PrintStream(filename);
            in.println("Cold hearted orb that rules the night");
            in.close();
        }
        catch(Exception e)   {
            e.printStackTrace();
            System.out.println("ERROR");
        }

        try {
        Scanner out = new Scanner(new File(filename));
        while (out.hasNextLine())
            System.out.println(out.nextLine());
        out.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void seleniumTest()  {
        System.setProperty("webdriver.chrome.driver","c:\\seleniumDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.monster.com");

//      WebElement stuff = driver.findElement(By.id("));
 //       WebElement element(By.id("monster-npp-signin"));
        WebElement sign = driver.findElement(By.id("monster-npp-signin"));
        sign.click();

        WebElement login = driver.findElement(By.cssSelector("#EmailAddress"));
        login.sendKeys("test@paris.com");
        WebElement password = driver.findElement(By.cssSelector("#Password"));
        password.sendKeys("Paris111");
        driver.findElement(By.cssSelector("#btn-login")).click();


//<a id="monster-npp-signin" href="https://login20.monster.com/Login/SignIn?ch=MONS&amp;intcid=skr_navigation_www_Signin">Sign In</a>

    }

    @Test
    public void palindrome()    {
        String word = "abcdcba";

        StringBuilder str = new StringBuilder(word);
        if (str.reverse().toString().equals(word))
            System.out.println("Palindrome");
        else
            System.out.println("NOT");
    }

    @Test
    public void pal()   {
        String word = "abcdcba";
        String temp = "";
        for(int i = word.length()-1; i >= 0; i--)
            temp = temp + word.charAt(i);
        System.out.println(temp);
        if(word.equals(temp))
            System.out.println("PAlindrome");
        else
            System.out.println("NOT");
    }

}










