package LinkedListSingle;

public class LinkedListMethods {

    private Node head;

    LinkedListMethods() {
        head = null;
    }

    public void length() {
        Node position = head;
        int size = 0;
        while (position != null)    {
            position = position.getLink();
            size++;
        }
    }
}