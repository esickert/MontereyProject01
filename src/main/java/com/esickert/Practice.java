import org.junit.Test;

public class Practice {

  @Test
  public void helloWorld()  {
    System.out.println("HELLO WORLD");
  }

  @Test
  public void palindrome()  {
    String word = "abcdcba";
    String temp = "";
    for(int i = word.length()-1; i >= 0; i--) {
      temp = temp + word.charAt(i);
      System.out.println(temp);
    }
    if (word.equals(temp))
      System.out.println("PALINDROME");
    else
      System.out.println("NOT!!!");
  }


}
