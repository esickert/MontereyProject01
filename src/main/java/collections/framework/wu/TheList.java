package collections.framework.wu;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import static org.junit.Assert.assertTrue;

public class TheList {

    List myList = new LinkedList();

    @Test
    public void myList() {
    for(int i = 1;i<=7;i++)    {
       myList.add(i);
    }
    myList.add(5, 3);

    for( Object temp:myList)    {
       System.out.print(temp + " ");
    }
    System.out.println("\nExample of same elements in the list");
    System.out.println("The size of myList is " + myList.size());
    System.out.println(myList.remove(2));
    System.out.println("The size of myList is " + myList.size());

    assertTrue(myList.get(5).equals(3));
    }
}
