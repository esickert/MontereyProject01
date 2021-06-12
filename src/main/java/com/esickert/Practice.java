package com.esickert;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.collections.Maps;


import java.io.File;
import java.io.PrintStream;
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
    System.out.println("\n");
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
 //********************************************************
 @Test
 public void findLargest()  {
    int[] a = {3,66,4,65,2,3,54,8,5,76,444,6,7,8};
    int temp = 0;
    for(int i = 0; i < a.length -1; i++)  {
      if (temp < a[i])
        temp = a[i];
    }
    System.out.println("The largest is " + temp);
 }
 //********************************************************
  @Test
  public void secondLargest() {
    int[] b = {2,4,5,8,5,6,99,33,7,665};
    int temp = 0;
    int temp2 = 0;
    for (int i = 0; i < b.length; i++)  {
      if (temp < b[i])  {
        temp2 = temp;
        temp = b[i];
//        System.out.println(temp);
      }
      else
        if (temp2 < b[i]) {
          temp2 = b[i];
//          System.out.println(temp2);
        }
    }
    System.out.println(temp + " is the largest");
    System.out.println(temp2 + " is the second largest");
  }
  //*******************************************************
  @Test
  public void sumOfDigits() {
    int num = 123456;
    int temp = 0;
    while (num > 0)  {      //??????????????
      temp = temp + (num%10);
      num = num / 10;
    }
    System.out.println(temp);
  }
  //*******************************************************

  @Test
  public void reverseDigits() {
    int num = 123456;
    int temp = 0;
    while (num > 0) {
      temp = (temp * 10) + (num % 10);
      num = num / 10;
    }
    System.out.println(temp);
  }
  //*******************************************************

  @Test
  public void pairs() {
    int[] c = {3,6,1,7,5,8,9,4,6,4,5,7,9,7,3,4,2,5};
    int sum = 13;
      Map<Integer,Integer> pairs = new HashMap<>();
      for(int i = 0; i <= c.length - 1; i++)    {
        if (pairs.containsKey(sum-c[i]))
          System.out.println("(" + (sum - c[i]) + ";" + c[i] + ")");
        else
          pairs.put(c[i], 0);
      }
 }
 //********************************************************
    @Test
    public void printInFile() throws Exception   {
      String testFile = "/home/esickert/temp/erich.txt";
//      PrintStream output = null;

        PrintStream output = new PrintStream(new File(testFile));

        output.println("This is the end; beautiful friend");

        Scanner sc = new Scanner();
//




    }
    }


