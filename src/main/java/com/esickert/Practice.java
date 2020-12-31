package com.esickert;

import org.junit.Test;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Practice   {

    @Test
    public void hey() {
    System.out.println("Hey!!! How's it going!!");
}
//***********************************************
    @Test
    public void writeToFile()   throws FileNotFoundException, Exception  {
        String filename = "c:\\tmp\\rick.txt";
        PrintStream output = null;

//        try {
            output = new PrintStream(new File(filename));
            output.println(("When the cold sea conspires in armour"));
            output.println("Sullen and aborted currents breed tiny monsters");
            output.println("True sailing is dead and the first animal jetison");
//        }
//        catch(FileNotFoundException e)  {
 //           System.out.println("ERROR");
//            System.exit(0);  //this is closing the system call I think
//        }
        output.close();

        BufferedReader in = new BufferedReader(new FileReader("c:\\tmp\\rick.txt"));
        String line;
        while((line = in.readLine()) != null)
        {
            System.out.print(line);
            System.out.println();
        }
        in.close();
    }
//***********************************************
    @Test
    public void pairs() {
        int[] a = {2,4,1,6,5,4,9,8,7,8,5,6,7,4,9,8,7};
        int sum = 13;

        Map<Integer, Integer> pairs = new HashMap<>();
        for(int temp : a)
        if(pairs.containsKey(sum - temp))
            System.out.println("(" + (sum - temp) + ":" + temp + ")");
        else
            pairs.put(temp, 0);
    }
//***********************************************

@Test
    public void palindrome()    {
        String word = "abcdcba";
        String temp = "";
        String temp2 = "";

        StringBuffer str = new StringBuffer(word);
        temp2 = str.reverse().toString();
        //iterating using new for loop
        for(char tmp:temp2.toCharArray())
            temp = temp + tmp;
        System.out.println(temp);
 //       for(int i = word.length() -1; i >= 0; i--)  {
 //           temp = temp + word.charAt(i);
 //           System.out.println(temp);
   //     }
        if( word.equals(temp2))
            System.out.println("PALINDROME");
        else
            System.out.println("not");
    }
 //**********************************************


}

