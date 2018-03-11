package LinkedListSingle;

public class TheLinkedList {
    public static void main(String[] args)  {

        LinkedListMethods list = new LinkedListMethods();
        int x = 0;

        while (x<4) {
            list.addNode("junk");
            x++;
        }

        System.out.println("This is the length of the list is: " + list.length());
        list.printList();


    }
}
