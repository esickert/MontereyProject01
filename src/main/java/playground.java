import org.junit.Test;

public class playground {

@Test
    public void sumOfDigits()   {
    int x = 32145;
    int temp = 0;

    while (x != 0) {
        temp = temp + x % 10;
        x = x / 10;
    }
    System.out.println(temp);

    }

@Test
    public void test2() {
        long x = 987654321L; //so this is now 64 bit number as 32 bit integer was too large
        long temp = 0;
        while (x != 0){
            temp = temp * 10 + (x % 10);
            x = x / 10;
        }
        System.out.println(temp);
}

@Test  //YEAH SO I FIGURED THIS OUT EXCEPT FOR HAVING TEMP 0 INSTEAD OF 1;
    public void factorial() {
    int temp = 1;
    int num = 7;

    while (num != 0)    {
        temp = temp * (num);
        num = num -1;
    }
    System.out.println(temp);


    }


}
