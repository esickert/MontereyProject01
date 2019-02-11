import org.apache.commons.lang3.builder.ToStringExclude;
import org.junit.Test;
import org.testng.collections.Maps;

import java.util.*;

public class PracticeJava {

    @Test
    public void maps() {

        int[] a = {2, 5, 3, 7, 6, 1, 9, 6, 3, 4, 2};  //this is an array.
        int sum = 13;

        Map<Integer, Integer> pairs = new HashMap<>();

        for (int i = 0; i <= a.length - 1; i++) {
            if (pairs.containsKey(sum - a[i]))
                System.out.println("(" + a[i] + ":" + (sum - a[i]) + ")");

            else
                pairs.put(a[i], 0);
        }
    }

    @Test
    public void palindrome() {

        String word = "abcba";
        String temp = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            temp = temp + word.substring(i, i + 1);
            System.out.println(temp);
        }
        if (word.equals(temp))
            System.out.println("Palindrone");
        else
            System.out.println("NOT");
    }

    @Test
    public void palindrome2() {
        String word = "abcba";

        StringBuilder str = new StringBuilder(word);

        if (word.equals(str.reverse().toString()))
            System.out.println("Palindrome");
        else
            System.out.println("NOT");

    }


    @Test
    public void largest() {
        int[] a = {22, 4, 1, 2, 3, 556, 76, 23, 98, 97};
        int temp = a[0];
        int temp2 = a[0];

        for (int i = 0; i <= a.length - 1; i++) {
            if (temp < a[i]) {
                temp2 = temp;
                temp = a[i];
            } else if (temp2 < a[i])
                temp2 = a[i];
        }
        System.out.println(temp + " is the largest");
        System.out.println(temp2 + " is the next largest");
    }


    @Test
    public void fib() {

         int x = 0;
         int y = 1;
         int z;
         System.out.print(x + " " + y);
         for (int i = 2; i <= 10; i++) {
             z = x + y;
             System.out.print(" " + z);
             x = y;
             y = z;
         }
    }

    @Test
    public void fibRec() {

        for (int i = 0; i <= 10; i++) {
            System.out.print(fib(i) + " ");
        }
    }

    public int fib(int x) {

        if ((x == 0) || (x == 1))
            return(x);
        else
            return fib(x - 1) + fib(x - 2);
    }

    @Test
    public void sumOfDigits() {   //WRONG***********************************************

        int num = 123456;
        int temp = 0;
        while (num > 0) {
            temp = temp + (num%10);
            num = num /10;
            System.out.println(temp);
        }
        System.out.println(temp);
    }

    @Test
    public void reverseNum()    {  //WRONG*****************************************************
        int num = 123456;
        int temp = 1;

        while (num >0)  {
           temp = num% 10;
           num = num/10;

        }
        System.out.println(temp);
    }






}