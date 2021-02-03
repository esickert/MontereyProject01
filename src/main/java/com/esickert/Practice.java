package com.esickert;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Practice  {

  @Test
    public void hello()   {
      System.out.println("Hello World");
  }

  @Test
  public void occurances()  {
    int[] a = {2,4,5,2,1,7,6,6,6,6,6,4,4,4,4,9,9,9,9};
    int x = 0;
    for(int i = 1; i <= 9; i++)  {
      x = i;
      occur(x, a);
    }
  }

  public void occur(int x, int[] a)  {
//    int[] a = {2,4,5,2,1,7,6,6,6,6,6,4,4,4,4,9,9,9,9};

    int temp = x;
    int count = 0;

    for(int i = 0; i <= a.length - 1; i++) {
      if (a[i] == temp)
        count++;
    }
    System.out.println("There are " + count + " of " + temp + "'s");
  }

}











