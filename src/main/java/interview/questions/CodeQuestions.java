package interview.questions;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.security.x509.IPAddressName;

import java.io.IOException;
import java.util.*;

import static java.util.Collections.sort;
import static org.testng.AssertJUnit.assertEquals;


    public class CodeQuestions {

        //*************************************************************
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

        //***************************************************************
//Fibanacci sequence recurssively
        @Test
        public void fibonacciRecursive() {
            for (int i = 0; i <= 10; i++)
                System.out.print(fib(i) + " ");
        }

        public static int fib(int x) {
            if ((x == 0) || (x == 1))
                return x;
            else
                return (fib(x - 1) + fib(x - 2));
        }

        //****************************************************
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

        // another method for determining a palindrone usin StringBuffer
        @Test
        public void StringBufferPalindrone() {
            String word = "abcdcba";
            StringBuffer str = new StringBuffer(word);
            if (word.equals(str.reverse().toString()))
                System.out.println("\nPalindrone");
            else
                System.out.println("\nNOT!!!!!!!");
        }

        //**************************************************
        // Remove duplicates from a list.

        @Test
        public void aList() {  //THIS IS SOMETHING WEIRD HERE WITH JAVA 8 AND CONVEETING ARRAY TO LIST

            String[] pets = {"dog", "cat", "fish", "grass", "grass"};
            List<String> aList = new ArrayList<String>();
            aList = new ArrayList<String>(Arrays.asList(pets));
            System.out.println("An array converted to a list: " + aList);
// I CAN'T SEEM TO MODIFY (ADD TO LIST) THE LIST THAT WAS CREATED FROM THE ARRAY...  NOW IT WORKS
            aList.add("dog");
            aList.add("cat");
            for (int i = 0; i <= 2; i++) {
                aList.add("bird");
            }
            System.out.println("\nSorting\n " + aList);

            Collections.sort(aList);
            for (String temp : aList) {
                System.out.print(temp + " ");
            }

            System.out.println("\nIs this sorted ???" + aList);
            Set<String> aSet = new HashSet(aList);

            System.out.println(aSet);
            for (String temp : aSet) {
                System.out.print(temp + " ");
            }
        }


        //**************************************************************
        //Find the largest number in an array.

        @Test
        public void findLargest() {  //very simple. My fuckup.
            int[] anArray = {1, 5, 4, 7, 33, 44, 3, 33, 33, 33, 2};
            int temp = 0;
            for (int i = 0; i < anArray.length - 1; i++)
                if (anArray[i] > temp) {
                    temp = anArray[i];
                    //               System.out.print(temp + " ");
                }

            System.out.println("\nThe largest number is " + temp);

//        List<Integer> list2 = Arrays.asList();
            List<Integer> aList = new ArrayList<>();
            for (int tmp : anArray) {
                aList.add(tmp);
            }
            System.out.println("This is a unsorted list " + aList);  //lists are not sorted
            SortedSet<Integer> aSet = new TreeSet<>(aList); //converts list to set and sorts that set.
            System.out.println("This is a sorted Set with no dups: " + aSet);
            //     aSet.add("string");
        }

        //**************************************************************

        @Test
        public void findFirstTwoLargest() {

            int[] nums = {1, 55, 32, -45, 66, -2, 86, 6789, -77};
            int temp = nums[0];
            int temp2 = nums[0];
            for (int i = 0; i <= nums.length - 1; i++) {
                if (temp < nums[i]) {
                    temp2 = temp;
                    temp = nums[i];
                } else if (temp2 < nums[i])
                    temp2 = nums[i];
            }
            System.out.println("Largest number is " + temp);
            System.out.println("The second largest number is " + temp2);

        }

        //**************************************************************
        //find the largest (or smallest) number in the array)
        @Test
        public void findLargestMethod() {
            int a = 12;
            int b = 123;
            int c = -54;
            int d = 2;
            int e = 1090;
            int f = 33;
            int g = -456;

            System.out.println("\nThe largest number is " + findBiggest(a, b, c, d, e, f, g));
        }

        public int findBiggest(int h, int i, int j, int k, int l, int m, int n) {
            int[] anArray = {h, i, j, k, l, m, n};
            for (int temp : anArray)
                System.out.print(temp + " ");
            int temp = h;
            for (int x = 0; x <= anArray.length - 1; x++) {
                if (temp < anArray[x])
                    temp = anArray[x];
            }
            return temp;
        }

        //**********************************************************************
        @Test  //sum up the individual digits in a number
        public void sumTheDigit() {
            int x = 123;
            System.out.println(sum(x));
        }

        public static int sum(int x) {
            if (x == 0)
                return x;
            else
                return ((x % 10) + sum(x / 10));

        }

        //********************************************************************
//this will reverse the digits of a number
        @Test
        public void reverseTheNumber() {
            int num = 1234567;
            int temp = 0;

            while (num != 0) {
                temp = (temp * 10) + (num % 10);
                num = num / 10;
                System.out.println(temp);
            }
        }

        //*******************************************************************
//determine if a number is a palindrome
        @Test
        public void integerPalindrome() {
            int number = 1234567;
            int num = number;
            int temp = 0;

            while (number != 0) {

                temp = (temp * 10) + (number % 10);
                number = number / 10;
            }
            System.out.println(temp);
            if (num == temp)
                System.out.println("\nPalindrome");
            else
                System.out.println("\nNOT!!!!!");
        }//end of integerPalindrome

//**********************************************************************************************************************

        //this is not done yet
        @Test
        public void find33rdIPAddress() {

            int firstOctet;
            int secondOctet;
            int thirdOctet;
            int fourthOctet;
            String IPAddress = "192.168.1.13";
            String[] ipArray = IPAddress.split("\\.");
            System.out.println("String ip address as array of strings " + Arrays.toString(ipArray));

            firstOctet = convertToInteger(ipArray, 0);
            secondOctet = convertToInteger(ipArray, 1);
            thirdOctet = convertToInteger(ipArray, 2);
            fourthOctet = convertToInteger(ipArray, 3);

            System.out.println("This is the first octet: " + firstOctet);
            System.out.println("This is the second octet: " + secondOctet);
            System.out.println("This is the third octet: " + thirdOctet);
            System.out.println("This is the fourth octet: " + fourthOctet);

            System.out.println("Full IP adress as integers : " + firstOctet + "." + secondOctet + "." + thirdOctet + "." + firstOctet);
        }

        public static int convertToInteger(String[] num, int x) {
            int octet = Integer.parseInt(num[x]);
            return octet;
        }

        @Test
        public void maximizeSeleniumBrowser() throws IOException, InterruptedException {   ///IMPORTANT!!!!!!!!!!!!!!!!!!!!!!!!!!!!

            System.setProperty("webdriver.chrome.driver", "c://SeleniumDrivers//chromeDriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("http://www.google.com");
            driver.manage().window().maximize();
            Thread.sleep(5000);
            driver.quit();
        }

//?????????????????????????????????????????????????????????????????????????

        //Given an array of package item weights and a weight limit, implement a function that finds two items whose sum of weights equals the weight limit.
//Your function should return a pair [i, j] of the indices of the item weights, ordered such that i > j.
//If such a pair doesn’t exist, return an empty array.
        @Test
        public void packageWeights() {
// I'm not sure this is completely correct.
            int[] w = {2, 45, 7, 3, 5, 1, 8, 9};
            int num = 10;
            for (int temp : addTwo(w, num)) {
                System.out.print(temp + " ");
            }
        }

        public int[] addTwo(int[] w, int limit) {
//          Find 2 numbers in the array whose sum equal the limit, 9
            int[] anArray = new int[2];
            for (int i = 0; i <= w.length - 1; i++) {
                for (int j = i; j <= w.length - 1; j++) {
                    if (w[i] + w[j] == limit) {
                        //    System.out.println(i + " " + j);
                        anArray[0] = j;
                        anArray[1] = i;
                    }
                }
            }
            return anArray;
        } //end of addTwo

        /*

           //Method 3 - Brute Force O(n^2)
            static void findPairs3(int[]a, int sum){

                for(int i=0; i<a.length; i++){
                    for(int j=i; j<a.length;j++){
                        if(a[i]+a[j] == sum)
                            System.out.println("("+a[i]+","+a[j]+")");
                    }
                }
            }
        */
//NOTE this is from https://stackoverflow.com/questions/4720271/find-a-pair-of-elements-from-an-array-whose-sum-equals-a-given-number
        @Test
        public void findPairs() {
            int a[] = {1, 10, 5, 8, 2, 12, 6, 4};
            findPairs1(a, 15);
//        findPairs2(a,10);
//        findPairs3(a,10);
        }

        // O(N) use a Map to insert values as keys & check for number's complement in map
        static void findPairs1(int[] a, int sum) {
            Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();
            for (int i = 0; i < a.length; i++) {
                if (pairs.containsKey(sum - a[i]))   //I don't understand this array gets into map
                    System.out.println("(" + a[i] + "," + (sum - a[i]) + ")");
                else {
                    pairs.put(a[i], 0);
                    pairs.get(a[i]);
                }
            }
        }

        @Test
        public void ahhMaps() {
            Map<Integer, String> aMap = new HashMap<>();
            aMap.put(1, "Dog");

            System.out.println(aMap.get(1));
            System.out.println(aMap.get("dog"));
        }

        @Test
        public void thirdVariable() { // very simple my fuckup!!
            int a = 100;
            int b = 2;
            a = a + b;
            b = a - b;
            a = a - b;
            System.out.println("a is " + a);
            System.out.println("b is " + b);
        }

} //end of class CodeQuestions


