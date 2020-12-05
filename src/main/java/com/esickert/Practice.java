package com.esickert;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

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
    public void
}