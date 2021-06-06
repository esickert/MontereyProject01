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
    System.out.println("\n Hello world. We are using junit and maven");
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
//*********************************************************
  @Test
  public void fibRec()  {
    for(int i = 0; i <= 10; i++) {
      System.out.print(" " + recursive(i));
    }
  }

  public int recursive(int x)  {
      if ((x == 0) || (x == 1))
        return x;
      else  {
        return (recursive(x-1) + recursive(x-2));
      }
    }
  //*******************************************************

  @Test
  public void palindrome()  {
    String word = "abcdcba";
    String temp = "";
    for(int i = word.length() -1 ; i >= 0; i--) {
      temp = temp + word.charAt(i);
      System.out.println(temp);
    }
    if(word.equals(temp))
      System.out.println("\n Palindrome");
    else
      System.out.println("NOT");
  }
  //*******************************************************
  @Test
  public void palinStringBuffer() {
    String word = "abcdcba";
    String temp = "";  //not used!!

    StringBuffer str = new StringBuffer(word);
    if (str.reverse().toString().equals(word))
      System.out.println("PALINDROME");
    else
      System.out.println("not");
  }



}

