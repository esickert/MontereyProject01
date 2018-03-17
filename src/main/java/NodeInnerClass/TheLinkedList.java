package NodeInnerClass;

public class TheLinkedList {
    public static void main(String[] args)  {

        IntLinkedList aList = new IntLinkedList();


        System.out.println("The length of the list is " + aList.length());
        for(int i = 0; i <= 5; i++) {
            aList.addNode(i);
//            System.out.println(i);
        }
        int length = aList.length();
        int[] test = new int[length];

        test = aList.toArray();
        System.out.println("The length of the list is a " + aList.length());
        aList.printList();

        for(int temp: test)
            System.out.print("  " + temp);
//


    }
}
