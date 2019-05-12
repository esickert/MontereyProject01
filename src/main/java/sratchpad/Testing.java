package sratchpad;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class Testing {

@Test
    public void arrayToSet()    {
     int[] a = {1,4,2,3,6,1,2,1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,5,5};

    Set<Integer> aSet = new HashSet<>();

    for(int temp:a) {
        aSet.add(temp);
    }

    for(int temp:aSet)  {
      System.out.print(temp + " ");
    }

}
}
