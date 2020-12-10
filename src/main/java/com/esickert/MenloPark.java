package com.esickert;

import org.junit.Test;
import org.openqa.selenium.remote.server.handler.DeleteSession;
import org.testng.collections.Maps;

//import java.util.HashMap;
//import java.util.Map;
import java.util.*;

public class MenloPark {

    @Test
    public void Testing()   {
        System.out.println("This is for Savitch");
    }

    @Test
    public void palidrome() {
        String word = "abcdcb";
        String temp = "";

        for(int i = word.length()-1; i >= 0; i--)  {
            temp = temp + word.charAt(i);
            System.out.println(temp);
        }
        System.out.println(word.equals(temp));
        if (word.equals(temp))
            System.out.println("Palindrome");
        else
            try {
                System.out.println(1/0);
            }
            catch(Exception e) {
                System.out.println(e + "\nNOT a palindrome");
            }
    }

    @Test
    public void palindromeStringBuffer()    {
        String word = "abcdcba";
        String temp = "";

        StringBuilder str = new StringBuilder(word);
        if (word.equals(str.reverse().toString()))
            System.out.println("Palindrome");
        else
            try {
                System.out.println(1/0);
            }
            catch(Exception e) {
                System.out.println(e + "\nNOT a palindrome");
            }
    }

    @Test
    public void pairs() {
        int[] a = { 2,3,2,5,6,4,8,6,1,2,9,8,6,7};
        int sum = 15;

        Map<Integer, Integer> pairs = new HashMap<>();

        for (int i = 0; i <= a.length-1; i++)   {
            if (pairs.containsKey(sum - a[i]))
                System.out.println("(" + (sum - a[i]) + ":" + a[i] + ")");
            else
                pairs.put(a[i], 0);
        }
    }

}
