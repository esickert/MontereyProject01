package com.esickert;

import org.junit.Test;

import java.util.*;

public class Practice{

    @Test
    public void test()  {
        System.out.println("Practicing my piano scales");
    }

    @Test
    public void mapPairs()  {
        int[] a = {2,5,1,2,7,5,9,7,8,5,3,4,2,1};
        int sum = 13;

        Map<Integer, Integer> aMap = new HashMap<>();
        for(int i = 0; i <= a.length-1; i++)
            if (aMap.containsKey(sum - a[i]))
                System.out.println("(" + a[i] + ":" + (sum - a [i]) + ")");
            else
                aMap.put(a[i], 0);
    }

    @Test
    public void palindrome()    {
        String word = "abcdcb";
        String temp = "";

        for(int i = word.length()-1; i >= 0; i--)   {
            temp = temp + word.charAt(i);
            System.out.println(temp);
        }
        if (word.equals(temp))
            System.out.println("Palindrome");
        else
            try {
                System.out.println(1/0);
            }
            catch (Exception e)   {
                System.out.println("ERROR!!!");
           }
    }

    @Test
    public void switchNum() {
        int a = 111;
        int b = 222;

       b= a + b;
       System.out.println(b);
       a = b - a;  // this sets the value of a to value of b
       b = b - a;  //
        System.out.println("b now equals " + b);
        System.out.println("a now equals " + a);
    }

//****************************************************************************************
    @Test
    public void shuffleIt() {  //this doesn't work in intellij!!!!!!!!!!!!!!!!
        String[] names = {"tom", "dick", "harry", "betty", "john", "sally", "steve"};
        List nameAsList = Arrays.asList(names);   //###########################################
        nameAsList.toArray();
        System.out.println(Arrays.toString(names)); //#########################################
        int time = 500;

        for(int i = 0; i <= 10; i++) {
            try {
                System.out.print(names[0]);
                Thread.sleep(time);
                System.out.print("\r                       \r");
                System.out.flush();
                Thread.sleep(time);
                Collections.shuffle((nameAsList));
            }
            catch (Exception e)  {
                System.out.println("ERROR");
            }
        }
    }
//*************************************************************************************

    @Test
    public void sumOfDigits()   {
        int num = 12346;
        int temp = 0;
        while (num > 0) {
            temp = temp + (num % 10);
            System.out.println(temp);
            num = num / 10;
        }
        System.out.println(temp);
    }

    @Test
    public void reverseDigits() {
        int num = 12345;
        int temp = 1;
        while(num < 0){
            temp = temp * ( num % 10);
            num = num / 10;
        }
        System.out.println(temp);
    }
}