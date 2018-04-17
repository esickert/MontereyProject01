package interview.questions;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CodeQuestions {

    @Test
    public void fibonacci() {
        int x = 0;
        int y = 1;
        int z;
        int count = 10;
        System.out.print(x + " " + y);

        for (int i = 2; i <= count; i++) {
            z = x + y;
            System.out.print(" " + z);
            x = y;
            y = z;
        }
        System.out.println("\nThe Fibonacci Sequence");
    }

    @Test
    public void fibonacciRecursive() {
        for(int i = 0; i <= 10; i++)
            System.out.print(fib(i) + " ");
    }

    public static int fib(int x)    {
        if ((x ==0)||(x==1))
            return x;
        else
            return (fib(x -1) + fib(x-2));
    }

    //*******************************************************************
    @Test
    public void palandrome() {
        String x = "abcdcba";
        String temp = "";
        for (int i = x.length() - 1; i >= 0; i--) {
            temp = temp + x.substring(i, i + 1);
        }
        if (temp.equals(x))
            System.out.println(x + " is a palindrome!!!!");
        else
            System.out.println("NOT!!!");


    }

    @Test
    public void aList() {

        List<String> aList = new ArrayList<String>();
        aList.add("dog");
        aList.add("cat");
        for (int i = 0; i <= 2; i++) {
            aList.add("bird");
        }
        for (String temp : aList) {
            System.out.print(temp + " ");
        }

        Set<String> aSet = new HashSet<String>(aList);
        System.out.println();
        for (String temp : aSet) {
            System.out.print(temp + " ");
        }

    }

    @Test
    public void findLargest()   {
        int[] anArray = {1,5,4,7,8,9,12,33,2,1};
        int temp = 0;
        for(int i = 0; i < anArray.length-1; i++)
            if (anArray[i]> temp) {
                temp = anArray[i];
                System.out.print(temp + " ");
            }

            System.out.println("\nThe largest number is " + temp);
    }
} //end of class CodeQuestions
