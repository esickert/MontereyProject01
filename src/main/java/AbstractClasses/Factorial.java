package AbstractClasses;

import org.testng.annotations.Test;

import static interview.questions.CodeQuestions.fib;

@Test
public class Factorial {

    public void fac()   {
        int temp = 1;
        int num = 5;
        while (num > 0) {
            temp = temp * num--;
        }
        System.out.println(temp);

    }

    public void fac2()  {
    int num = 5;
    int temp = 1;
 //   when the inequlities hit 0 it will 0 out temp
    while (num > 0) {
        temp = temp * num--;
        System.out.println(temp);
    }
    System.out.println(temp);
    }

    public void fib1()  {
        for(int i = 0; i <= 10; i++) {
            System.out.print(fib(i) + " ");
        }
    }

    public int fib(int x)   {
        if ((x == 0)|| (x ==1))
            return x;
        else
            return (fib(x-1)+fib(x-2));
    }

    public void fib2()  {

        int a = 0;
        int b = 1;
        int c;
        System.out.println(a + " " + b);
        for(int i = 2; i <= 10; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        }

    }








