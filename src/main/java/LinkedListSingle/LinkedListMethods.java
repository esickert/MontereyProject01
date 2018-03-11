package LinkedListSingle;

public class LinkedListMethods {

    private Node head;  //head reference

    LinkedListMethods() {
        head = null;
    }

    public void addNode(String newStuff)   {
        head = new Node( newStuff, head);
    }



    public int length() {
        Node position = head;
        int size = 0;
        while (position != null)    {
            position = position.getLink();
            size++;
 //           System.out.println(size);
        }
        return size;
    }

    public void printList(){
        Node position = head;
        while (position != null)    {
            System.out.println(position.getStuff());
            position = position.getLink();
        }
    }
}