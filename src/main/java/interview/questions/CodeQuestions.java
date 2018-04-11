package interview.questions;

import org.junit.Test;

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

    for(int i = 2; i <= count; i++) {
        z = x + y;
        System.out.print(" " + z);
        x = y;
        y = z;
    }
    System.out.println("\nThe Fibonacci Sequence");
}

@Test
public void fibonacciRecursive()    {
    int number = 10;
    for(int i = 0; i <= number; i++) {
        System.out.print(fib(i) + " ");
    }
}
public int fib(int num)   {
    if ((num == 0)||(num == 1))
        return num;
    else
        return (fib(num - 1)+ fib(num - 2));
}

//*******************************************************************
@Test
public void palandrome()    {
    String x = "abcdcba";
    String temp = "";
    for(int i = x.length()-1; i >= 0; i--)  {
        temp = temp + x.substring(i, i+1);
    }
    if ( temp.equals(x))
        System.out.println(x + " is a palindrome!!!!");
    else
        System.out.println("NOT!!!");


}

@Test
public void aList() {

    List<String> aList = new ArrayList<String>();
    aList.add("dog");
    aList.add("cat");
    for(int i = 0; i <= 2; i++) {
        aList.add("bird");
    }
    for(String temp:aList)  {
        System.out.print(temp + " ");
    }

    Set<String> aSet = new HashSet<String>(aList);
    System.out.println();
    for(String temp: aSet)  {
        System.out.print(temp + " ");
    }

}

} //end of class CodeQuestions
