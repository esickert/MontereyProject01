package com.esickert;

import org.junit.Test;
import org.openqa.selenium.remote.server.handler.DeleteSession;

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
    public void pairs() {}



}
