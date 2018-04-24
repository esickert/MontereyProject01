package interview.questions;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.security.x509.IPAddressName;
import java.util.*;

import java.util.*;

import static java.util.Collections.sort;

public class CodeQuestions {

//**********************************************************************
// Fibinacci sequence NON recursive
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

//**********************************************************************
//Fibanacci sequence recurssively
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
    //  Palindrome
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

    //******************************************************************
    // Remove duplicates from a list.

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

    //*********************************************************************
    //Find the largest number in an array.

    @Test
    public void findLargest()   {
        int[] anArray = {1,5,4,7,33,44,3,33,33,33,2};
        int temp = 0;
        for(int i = 0; i < anArray.length-1; i++)
            if (anArray[i]> temp) {
                temp = anArray[i];
 //               System.out.print(temp + " ");
            }

        System.out.println("\nThe largest number is " + temp);

//        List<Integer> list2 = Arrays.asList();
        List<Integer> aList = new ArrayList<>();
        for(int tmp: anArray)  {
            aList.add(tmp);
        }
      System.out.println("This is a unsorted list "  + aList);  //lists are not sorted
      SortedSet<Integer> aSet = new TreeSet<>(aList); //converts list to set and sorts that set.
      System.out.println("This is a sorted Set with no dups: "  + aSet);
 //     aSet.add("string");
    }

    //********************************************************************
    @Test
    public void findLargestMethod() {
        int a = 12;
        int b = 123;
        int c = -54;
        int d = 2;
        int e = 1090;
        int f = 33;
        int g = -456;

        System.out.println("\nThe largest number is " + findBiggest(a,b,c,d,e,f,g));
    }

    public int findBiggest(int h, int i, int j, int k, int l, int m, int n )    {
        int[] anArray = {h,i,j,k,l,m,n};
        for(int temp: anArray)
            System.out.print(temp + " ");
        int temp = h;
        for(int x = 0; x <= anArray.length-1; x++)   {
            if (temp < anArray[x])
                temp = anArray[x];
        }
        return temp;
    }

    //**********************************************************************

    @Test
    public void find33rdIPAddress() {

        int firstOctet;
        int secondOctet;
        int thirdOctet;
        int fourthOctet;
        String IPAddress = "192.168.1.13";
        String[] ipArray = IPAddress.split("\\.");
        System.out.println(Arrays.toString(ipArray));
        firstOctet = convertToInteger(ipArray, 0);
        secondOctet = convertToInteger(ipArray, 1);
        thirdOctet = convertToInteger(ipArray, 2);
        fourthOctet = convertToInteger(ipArray, 3);
        System.out.println("This is the first octet: " + firstOctet);
        System.out.println("This is the second octet: " + secondOctet);
        System.out.println("This is the thirdOctet octet: " + thirdOctet);
        System.out.println("This is the fourthOctet octet: " + fourthOctet);

        System.out.println("FufirstOctet + "." + secondOctet + "." + thirdOctet + "." + firstOctet);
    }

    public static int convertToInteger(String[] num,int x)  {
        int octet = Integer.parseInt(num[x]);
        return octet;
    }

} //end of class CodeQuestions
