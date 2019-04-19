import org.junit.Test;

public class Scratchpad {

    @Test
    public void Switch()    {

        int a = 0;
        int b = 999;

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("This is a now: " + a);
        System.out.println("This is b now: " + b);
    }
}
