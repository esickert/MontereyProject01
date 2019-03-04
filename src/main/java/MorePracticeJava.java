import org.junit.Test;

public class MorePracticeJava {

    @Test
    public void Test(){
        System.out.println("MORE PRACTICE");

    }

    @Test
    public void Reverse(){

        String word = "abcdcba";
        String temp = "";

        for(int i = word.length()-1; i >= 0; i--) {
            temp = temp + word.substring(i, i + 1);
            System.out.println(temp);
        }
        if (word.equals(temp))
            System.out.println("Palidrome");
        else
            System.out.println("NOT");
        }

    @Test
    public void strBuffer() {

        String word = "abcdcba";
        String temp = "";

        StringBuffer str = new StringBuffer(word);
        System.out.println(word.equals(str.reverse().toString()));
        if (word.equals(str.toString()))
            System.out.println("Palindrome");
        else
            System.out.println("NOT");
    }



}


