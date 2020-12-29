package com.esickert;

import org.junit.Test;

import java.io.*;

public class Practice   {

@Test
public void hey() {
    System.out.println("Hey!!! How's it going!!");
}

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

}
