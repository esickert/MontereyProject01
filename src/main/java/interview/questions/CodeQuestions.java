package interview.questions;

import org.junit.Test;

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

//*******************************************************************
@Test
public void palandrome()    {
    String x = "abcdcba";
    String temp = "";
    for(int i = x.length()-1; i >= 0; i--)  {
        temp = temp + x.substring(i,i+1);
        System.out.println(temp);
    }
    if (temp.equals(x))
        System.out.println(x + " is a palindrome");
    else
        System.out.println(x + " is NOT a palindrome.");
}

@Test
public void aList() {
    
}

} //end of class CodeQuestions
