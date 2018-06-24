package com.esickert;

import org.junit.Test;

public class Playground {

@Test
public void fib()   {
    int a = 0;
    int b = 1;
    int c;
    System.out.print(a + " " + b);
    for(int i = 2; i <= 10; i++)    {
        c = a + b;
        System.out.print(" " + c);
        a = b;
        b = c;
    }
}


}



