package TDD;

public class Mathematics implements Subtraction, Addition {

    public int add(int x, int y)    {
        return x + y;
    }

    public int minus(int x, int y)  {
        return 0;
    }

    public int multiplication(int x, int y) {
        return 0;
    }
}
