import org.junit.Test;


import java.util.HashMap;
import java.util.Map;

public class MorePracticeJava   {

@Test
public void Test()  {
    //***************************************
    System.out.println("Hello World");
}

@Test
    public void addPairs() {

    int[] a = {3, 5, 1, 2, 7, 6, 8, 5, 9, 66, 55, 4, 5, 2, 8};
    int sum = 17;

    Map<Integer, Integer> pairs = new HashMap<>();

    for (int i = 0; i < a.length-1; i++) {
        if (pairs.containsKey(sum - a[i]))
            System.out.println("(" + a[i] + ":" + (sum - a[i]) + "}");
        else
            pairs.put(a[i], 0);
    }
}

//*******************************************
@Test
 public void palidrome() {
    String word = "the beginning";
    String temp = "";

    for (int i = word.length()-1; i >= 0; i--) {
        temp = temp + word.substring(i, i + 1);
        System.out.println(temp);
    }
    System.out.println(temp);
}



}