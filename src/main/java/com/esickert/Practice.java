package com.esickert;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.collections.Maps;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.*;

import static org.openqa.selenium.Keys.ENTER;

public class Practice {

  @Test
  public  void constructor()  {System.out.println("\nWe will be defining a constructor ...");
   }

  @Test
  public void helloWorld()  {System.out.println("\n Hello world. We are using junit and maven");
  }

  //******************************************************
  // *

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
//****************************************************
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
 //******************************************************
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
 //********************************************************
    @Test
    public void printInFile() throws Exception   {
      String testFile = "//home//esickert//temp//erich.txt";
//      PrintStream output = null;

        PrintStream output = new PrintStream(new File(testFile));

        output.println("This is the end; beautiful friend");
        output.println("This is the end, my only friend the end");

        try (BufferedReader br = new BufferedReader(new FileReader(testFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
    //*****************************************************
    //*****************************************************
    @Test
    public void fizzBizz()  {

      int num = 30;

      while (num >= 0)   {
          if ((num == 0)|| (num == 1))
              System.out.println(num);
          else if ((num % 3 == 0) && (num % 5 ==0))
              System.out.println("fizzBizz");
          else if ( num % 3 == 0)
              System.out.println("fizz");
          else if (num % 5 == 0)
              System.out.println("BIZZ");
          else
              System.out.println(num);
          num--;
    }
 }

 //********************************************************
    @Test
    public void fizzBizzRecur() {
      System.out.println(fizzBizzrec(30));
    }

    public int fizzBizzrec(int x)   {
      if ((x == 0) || (x == 1))
          return x;
      else if ((x % 3 == 0) && (x % 5 == 0))
          System.out.println("FizzBIZZ");
      else if (x % 3 == 0)
          System.out.println("fizz");
      else if (x % 5 == 0)
          System.out.println("BIZZ");

    System.out.println(--x);
    return fizzBizzrec(x);
   }
//*********************************************************
    @Test
    public void swapNum()   {
        int a = 11;
        int b = 999;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a is now " + a);
        System.out.println("b is now " + b);
    }
    //*****************************************************

    @Test
    public void aCount()    {
      int[] d = {2,2,2,2,3,3,4,4,4,5,5,5,6,6,7,7,8,8,9,9};
      int x = 0;
      while (x <= 10) {
          countElements(x, d);
        x++;
      }
    }

    public void countElements(int num, int[] d)  {
      int count = 0;

      for(int i = 0; i <= d.length-1; i++)    {
          if (num == d[i]) {
              count++;
          }
     }
      System.out.println("There are " + count + " instances of " + num);
    }
//*********************************************************
    @Test
    public void queue() {
      Stack stk1 = new Stack();
      Stack stk2 = new Stack();
      int num1 = 2;
      int num3 = 3;
      //local class
      class theQueue  {
          int test()    {
              return stk1.size() + stk2.size();
          }
          boolean isEmpty() {
              return stk1.empty();
          }
          void enqueue (int x) {
              stk1.push(x);
          }
      }
//        stk1.push(num1);
//      stk1.push(num3);
      theQueue testMe = new theQueue();
      testMe.enqueue(5);
      testMe.enqueue(2);
      System.out.println(testMe.test());
      System.out.println(testMe.isEmpty());

    }

 /*
    @Test
    import java.io.*;

    public class CmdTest {
    //I need to work on this code!!!!!!!!!!!!!!!!!!!!!!!!!!!.
    //    public static void main(String[] args) throws Exception {
            ProcessBuilder builder = new ProcessBuilder(
                    "cmd.exe", "/c", "cd \"C:\\Program Files\\Microsoft SQL Server\" && dir");
            builder.redirectErrorStream(true);
            Process p = builder.start();
            BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while (true) {
                line = r.readLine();
                if (line == null) { break; }
                System.out.println(line);
            }
        }
    }  */
}




