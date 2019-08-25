package com.sketchpad;

import org.junit.Test;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;

public class sketchPad {

    @Test
    public void javaIO() {
        String file = "C://Temp//erik.txt";
        File filename = new File(file);
        PrintStream stuff = null;
        try {
            stuff = new PrintStream(filename);
            stuff.println("hello there");
        } catch (IOException e) {
            System.out.println("ERROR");
            e.printStackTrace();
        }

        Scanner scan = new Scanner(stuff);
        while (scan.hasNextLine()) {
            String text = scan.nextLine();
            System.out.println(text);
        }
        //*********************************************


    }
}

