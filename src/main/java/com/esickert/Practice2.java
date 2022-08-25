package com.esickert;

import org.junit.Test;

public class Practice2 {

    @Test
    public void printme()  {
        System.out.println("This is a test");
        System.out.println("Of the emergency broadcast system.");
    }
    //********************************************************

    @Test
    public void fibanacci() {
    int a = 0;
    int b = 1;
    int c = 0;
    for(int i = 0; i <= 10; i++) {
            c = a + b;
            a = b;
            System.out.print( " " + c);
    }
 //   System.out.println( " " + c);
    }
}
