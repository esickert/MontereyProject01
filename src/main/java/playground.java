import org.junit.Test;

public class playground {

@Test
public void palindromeWord()    {

    String word = "abcdcba";
    String temp = "";

    for(int i = word.length()-1; i >= 0; i--)   {
        temp = temp + word.substring(i,i+1);
        System.out.println(temp);
    }
    if (word.equals(temp))
        System.out.println("\nPalindrome");
    else
        System.out.println("\nNOT!!!!!!!!!");
}

//********************************************************



}
