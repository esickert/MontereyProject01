package com.esickert;

import org.junit.Test;
import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class Practice  {

    @Test
    public void toFile() throws Exception   {
        String filename = "c://tmp//erich.txt";

        PrintStream in = new PrintStream(filename);
        in.println("Cold hearted orb that rules the night");
        in.close();

        Scanner out = new Scanner(new File(filename));

    }

}










