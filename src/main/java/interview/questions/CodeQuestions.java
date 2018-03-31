package interview.questions;

import org.junit.Test;

public class CodeQuestions {

@Test
public void fibonacci() {
    int x = 0;
    int y = 1;
    int z;
    int count = 10;
    System.out.print(x + y + " ");

    for(int i = 2; i <= count; i++) {
        z = x + y;
        System.out.print(" " + z);
        x = y;
        y = z;
    }
    System.out.println("\nThe Fibonacci Sequence");
}
}
