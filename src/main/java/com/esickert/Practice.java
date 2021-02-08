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
import org.testng.collections.Maps;

import java.io.File;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Practice  {

  @Test
    public void hello()   {
      System.out.println("Hello World");
  }
//*******************************************************************
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
  //*****************************************************************
  @Test
  public void pairs() {
    int[] a = {2,5,1,7,6,8,5,6,4,9,8,4,5,3,7};
    int sum = 13;
    Map<Integer,Integer> pairs = new HashMap<>();
    for(int i = 0; i <= a.length - 1; i++)  {
      if(pairs.containsKey(sum - a[i]))
        System.out.println("(" + (sum - a[i]) + ":" + a[i] + ")");
      else
        pairs.put(a[i],0);
    }
  }
  //*****************************************************************
  @Test
  public void palindrome()  {
    String word = "abcba";
    String temp = "";

    for(int i = word.length()-1; i >= 0 ; i--) {
      temp = temp + word.charAt(i);
      System.out.println(temp);
    }
    if(word.equals(temp))
      System.out.println("Palindrome");
    else
      System.out.println("NOT");
  }
  //*****************************************************************
  @Test
  public void palindromeStringBuffer()  {
    String word = "abcdcba";

    StringBuffer str = new StringBuffer(word);
    if(str.reverse().toString().equals(word))
      System.out.println("Palindrome");
    else
      System.out.println("NOT");
  }
  //*****************************************************************
  @Test
  public void fibinacci() {      //this doesnt work!!!!!
    int a = 0;
    int b = 1;
    int c;
    System.out.print(a + " " + b);
    for (int i = 2; i <= 10; i++) {
      c = a + b;
      System.out.print(" " + c);
      b = a;
      c = b;
    }
  }

}












