package NodeInnerClass;

public class TheLinkedList {
    public static void main(String[] args)  {

        IntLinkedList aList = new IntLinkedList();

        System.out.println(aList.length());
        for(int i = 0; i <= 5; i++) {
            aList.addNode(i);
//            System.out.println(i);
        }

        System.out.println(aList.length());

    }
}
