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

    public void fac2()  {
        int x = 5;
        System.out.println(factorial(x));
    }

    public int factorial(int y) {
        if ((y == 0) || (y == 1))
            return y;
        else
            return (y * factorial(y-1));
        }
   }


