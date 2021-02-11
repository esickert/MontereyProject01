package com.esickert;

import org.junit.Test;
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
      a = b;     //FIGURE OUT WHY THIS WORKS ATITHMETICALLY.!!!!!!!!!!!!!!!
      b = c;
    }
  }
  //*****************************************************************
  @Test
  public void fibanacciRecursion()  {
    int x = 10;
    for(int i = 0; i <= 10; i++)  {
      System.out.print(fib2(i) + " ");
    }
 }

  public int fib2(int x) {
    if((x == 0)||(x ==1))
      return x;
    else
      return fib2(x-1) + fib2(x-2);
  }
  //*****************************************************************
  @Test
  public void printToFile() {

    String filename = "c://tmp//erich2.txt";
    try {
      PrintStream output = new PrintStream(filename);
      output.println("Lions in the street and roaming2");
    }
    catch(Exception e)  {
      System.out.println("ERROR");
      e.printStackTrace();
    }
}
  @Test
  public void printFromFile()  {
    String filename = "c://tmp//erich2.txt";
    File file = new File(filename);
    try {
      Scanner printOut = new Scanner(file);
      String line = printOut.nextLine();
      System.out.println(line);
    }
    catch(Exception e)  {
      System.out.println("ERROR");
      e.printStackTrace();
    }
  }
  //*****************************************************************
  @Test
  public void findLargest() {
    int[] b = {3,5,1,9,77,8,666,5,67,3,45,23,44,99};
    int temp = b[0];
    for(int i = 0 ; i <= b.length-1; i++) {
      if (temp < b[i])
        temp = b[i];
    }
    System.out.println("The largest number is " + temp);
  }
  //*****************************************************************
  @Test
  public void findSecondLargest() {
    int[] c = {33,5,2,6,7,88,77,666,4,56,9,8,7,8};
    int temp = c[0];
    int temp2 = c[0];

    if(temp < c[0]) {
      temp = c[0];
    else if (temp2 < c[0])
      temp2 = c[0];
    }




}












