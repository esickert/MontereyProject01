package AbstractClasses;

import org.testng.annotations.Test;

@Test
public class Factorial {

    public void fac()   {
        int temp = 1;
        int num = 3;
        while (num > 0) {
            temp = temp * num--;
        }
        System.out.println(temp);

    }
}
