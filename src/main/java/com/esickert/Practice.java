package com.esickert;

import org.junit.Test;

public class Practice {

    @Test
    public void check() {
        System.out.println("This is for practicing my piano scales");

    }
    //*************************************************************************************

    @Test
    public void palidrome() {
        String word = "abcdcba";
        String temp = "";  //remember this will add a space, space is a character!!!!;

        for(int i = word.length()-1; i >= 0; i--) {
            temp = temp + word.charAt(i);
            System.out.println(temp);
        }
        System.out.println(word.equals(temp));
        if (word.equals(temp))
            System.out.println("Palidrome");
        else
            System.out.println("NOT");
    }

    @Test
    public void palStringBuffer()   {
        String word = "abcdcba";
        String temp = "";

        StringBuffer str = new StringBuffer(word);
        if(word.equals(str.reverse().toString()))
            System.out.println("Palindrome");
        else
            System.out.println("not");
    }
    //*****************************************************************************


}
