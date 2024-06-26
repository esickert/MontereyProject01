package com.esickert;

import org.junit.Test;

public class Practice2 {

  @Test
    public void printme()  {
        System.out.println("This is a test");
        System.out.println("Of the emergency broadcast system.");
        System.out.println("Need to practice java and python!!!!!");;
    }
    //*********************************************************

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
    //***************************************************
    @Test
    public void printMe() {
    System.out.println("\nTesting JUST TESTING");
    }

    //*******************************************************
    @Test
    public void fibinacciRecursive()   {
        System.out.println("This is fibinacci recursive");
        for(int i = 0; i <= 2; i++)    {
            System.out.println("for loop !!!!!");
        }
 }

 @Test
 public void palindrome()   {
    System.out.println("This is coding for a PALINDROME");
    String word="abcdefg";
    String temp = "";
    System.out.println(word);
    System.out.println(temp);


}
 //pracice2() public practice2() {
//    System.out.println("This is creating a constructor- practice");
}

//practice2 test = new practice2()   //create an object of class practice {

//test();
//}
// }

