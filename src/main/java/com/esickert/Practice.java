package com.esickert;

import org.junit.Test;
import org.testng.collections.Maps;

import java.util.*;

public class Practice {

  @Test
  public void helloWorld()  {
    System.out.println("\n nHELLO WORLD");
  }

  //*****************************************************************
  @Test
  public void fibanacci() {
    int a = 0;
    int b = 1;
    int c;
    System.out.print(a + " " + b);
    for(int i = 2; i <= 10; i++)  {
      c = a + b;
      System.out.print(" " + c);
      a = b;
      b = c;
    }
  }
//*******************************************************************

  @Test
  public void fibRecurrsion(){
    for(int i = 0; i <= 10; i++)  {
      System.out.print(fib(i) + " " );
    }
  }
  public int fib(int x ) {
      if ((x == 0) || (x == 1))
            return x;
      else
        return fib(x-1) + fib(x-2);
 }
 //******************************************************************
  @Test
  public void palinedome()  {
    String word = "abcdcba";
    String temp = "";
    for(int i = word.length()-1; i >= 0; i--) {
      temp = temp + word.charAt(i);
      System.out.println(temp);
    }
    if (word.equals(temp))
      System.out.println("palidrome");
    else
      System.out.println("NOT");
  }

//*******************************************************************
  @Test
  public void palStringBulder() {
    String word = "abcdcba";

    StringBuilder str = new StringBuilder(word);
    if (str.reverse().toString().equals(word))
      System.out.println("palindrome");
    else
      System.out.println("NOT");
  }
//*******************************************************************

@Test
public void largest() {
    int[] a = {3333,66,54,7,67,2,342,32,2,4,566,6,789,890};
    int temp = a[0];
    for(int i = 0; i <= a.length - 1; i++)  {
      if (temp < a[i])
        temp = a[i];
    }
    System.out.println(temp + " is the largest");
}
//*******************************************************************

  @Test
  public void secondLargest() {
    int[] b = { 23,54,636,74,5,678,98,7675,453};
    int temp = b[0];
    int temp2 = b[0];
    for(int i = 0; i <= b.length-1; i++)  {
      if(temp < b[i]) {
        temp2 = temp;
        temp = b[i];
      }
      else
        if(temp2 < b[i])
          temp2 = b[i];
    }
    System.out.println("The largest is " + temp);
    System.out.println("The second largest is " + temp2);
  }

  //*****************************************************************
  @Test
  public void sumDigits() {
    int num = 12345;
    int temp = 0;
    while (num > 0) {
      temp = temp + num%10;
      System.out.print(temp + " ");
      num = num / 10;
    }
  }
//*******************************************************************

  @Test
  public void reverseDigits() {
    int num = 12345;
    int temp = 0;
    while (num > 0) {
      temp = (temp * 10) + (num % 10);
      num = num / 10;
    }
    System.out.println(temp);
  }

  //*****************************************************************
  @Test
  public void pairs() {
    int[] c = {2,5,3,7,1,2,3,8,6,9,8,5,6};
    int sum = 13;

    Map<Integer,Integer> pairs = new HashMap<>();
    for(int i = 0; i <= c.length-1; i++) {
      if(pairs.containsKey(sum - c[i]))
        System.out.println("(" + (sum - c[i]) + ":" + c[i] + ")");
      else
        pairs.put(c[i], 0);
    }
  }

//*******************************************************************

  @Test
  public void swapNumbers() {
    int a = 1;
    int b = 999;

    b = a + b;
    a = b - a;
    b = b - a;
    System.out.println("a is now " + a);
    System.out.println("b is now " + b);
  }
  //*****************************************************************
  @Test
  public void fizzBizz()  {
    int num = 30;
    for(int i = 0; i <= num; i++) {
      if ((i == 0) || ( i == 1))
        System.out.println(i);
      else if ((i % 3 == 0) && (i % 5 == 0))
        System.out.println("fizzBizz "  + i);
      else if (i % 3 == 0)
        System.out.println("fizz");
      else if (i % 5 == 0)
        System.out.println("BIZZ");
      else
        System.out.println(i);
    }
  }

  //*****************************************************************
  @Test
  public void fizzBizzRecursive() {
    System.out.println(fizzB(10));
  }

  public int fizzB(int x) {
    if ((x == 0) || (x == 1))
      return x;
    else if ((x % 3 == 0) && (x % 5 == 0))
      System.out.println(x + " fizzBiz");
    else if (x % 3 == 0)
      System.out.println("fizz " + x);
//    else if (x % 5 == 0)
//      System.out.println("BIZZ " + x);
    System.out.println(x);
    return fizzB(--x);
  }





}

