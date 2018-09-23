package TDD;

public class Mathematics implements Subtraction, Addition, Multiplication {

    int x = 4;
    int y = 2;

    public int add(int x, int y)    {
        System.out.println(x + y);
        return x + y;
    }

    public int minus(int x, int y)  {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }
}
