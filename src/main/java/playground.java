import org.junit.Test;

public class playground {

@Test
    public void factorial() {

        int num = 5;
        int temp = 1;

        while (num > 0) {
            temp = temp *(num--);
            System.out.println(temp);


        }
        System.out.println(temp);

    }




}
