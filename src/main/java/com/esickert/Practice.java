import org.junit.Test;

public class Practice {

  @Test
  public void helloWorld()  {
    System.out.println("HELLO WORLD");
  }

  //*****************************************************************
  @Test
  public void fibanacci() {
    int a = 0;
    int b = 1;
    int c;
    System.out.print(a + " " + b);
    for(int i = 2; i <= 10; i++)  {
      c = a + b;
      System.out.print(" " + c);
      a = b;
      b = c;
    }
  }
//*******************************************************************

  @Test
  public void fibRecurrsion(){
    for(int i = 0; i <= 10; i++)  {
      System.out.print(fib(i) + " " );
    }
  }
  public int fib(int x ) {
      if ((x == 0) || (x == 1))
            return x;
      else
        return fib(x-1) + fib(x-2);
 }
 //**********************************************
  @Test
  public void palinedome()  {
    String word = "abcdcba";
    String temp = "";
    for(int i = word.length()-1; i >= 0; i--) {
      temp = temp + word.charAt(i);
      System.out.println(temp);
    }
    if (word.equals(temp))
      System.out.println("palidrome");
    else
      System.out.println("NOT");
  }

//*******************************************************************
  @Test
  public void palStringBulder() {
    String word = "abcdcba";

    StringBuilder str = new StringBuilder(word);
    if (str.reverse().toString().equals(word))
      System.out.println("palindrome");
    else
      System.out.println("NOT");
  }

}

