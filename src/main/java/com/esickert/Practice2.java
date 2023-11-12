package com.esickert;

import org.junit.Test;

public class Practice2 {

    @Test
    public void printme()  {
        System.out.println(" This is a test");
        System.out.println("Of the emergency broadcast system.");
    }
    //********************************************************

    @Test
    public void fibanacci() {
    int a = 0;
    int b = 1;
    int c = 0;
    System.out.println("This is code for fibinacci sequence");
    for(int i = 1; i <= 10; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print( " " + c);
    }
    }

    //********************************************************
    @Test
    public void fibinacciRecursive()   {
        System.out.println(" This is fibinacci recursive");
    }
}
