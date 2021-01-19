package com.esickert;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

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
    public void chromeTest()   {     //this too works for chrome
        System.setProperty("webdriver.chrome.driver","c:\\seleniumDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        WebElement email = driver.findElement(By.className("gb_g"));  //this works
        email.click();
        driver.navigate().back();
  //
   //     WebElement search = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));


   }

   @Test
   public void firefoxTest()    {  //this works!!!!!!!!!!!
       System.setProperty("webdriver.gecko.driver","c://seleniumDrivers//geckoDriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        WebElement find = driver.findElement(By.cssSelector(".gLFyf"));
        find.sendKeys("dog" + Keys.ENTER);
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

    @Test
    public void fibinacci()     {
        int a = 0;
        int b = 1;
        int c;
        System.out.print(a + " " + b);
        for(int i = 0; i <= 10; i++)    {
            c = a + b;
            a = b;
            b = c;
            System.out.print(" " + c);
        }
    }

    @Test
    public void fibRec()    {
        for (int i = 0; i <= 10; i++)   {
            System.out.print(fib3(i) + " ");
    }
    }

    public int fib3(int x)   {
        if ((x == 0)||(x == 1))
            return x;
        else
            return (fib3(x - 1) + fib3(x - 2));
    }

    @Test
    public void pairs() {
        int[] a = {2,5,1,8,7,9,5,6,4,8,9,3,2,4};
        int sum = 13;


    }
}











