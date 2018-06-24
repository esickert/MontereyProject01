package com.esickert;

import org.junit.Test;

public class Playground {

@Test
    public void palindrome() {
    String word = "abcdcbaz";
    String temp = "";
    int front = (word.length() - 1) / 2;
    int back = word.length() - 1;
    for (int i = word.length() - 1; i >= 0; i--) {
        temp = temp + word.substring(i, i + 1);
        System.out.println(temp);
    }
    if (word.equals(temp))
        System.out.println("\nPalindrome");
    else
        System.out.println("\nNOT!!!!!!!!!!!!!!");
}
}



