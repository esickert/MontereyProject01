package com.esickert;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.io.File;
import java.util.*;

import static org.openqa.selenium.Keys.ENTER;

public class Practice {

  @Test
  public void helloWorld()  {
    System.out.println("\n HELLO WORLD");
  }

  //*****************************************************************

  @Test
  public void fibanacci() {
    int a = 0;
    int b = 1;
    int c;
    System.out.print(a + " " + b);
    for(int i = 0; i < 10; i++) {
      c = a + b;
      System.out.print(" " + c);
      a = b;
      b = c;
    }
  }

  @Test
  public void fibRec()  {
    for(int i = 0; i < 10; i++) {
      recussive(i);
    {
  }

  public int recussive(int x );
      if x == 0


}

