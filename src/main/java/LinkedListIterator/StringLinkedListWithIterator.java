package LinkedListIterator;

import static java.lang.System.exit;

public class StringLinkedListWithIterator {

    private Node head;
    private Node current;
    private Node previous;

    Node thing = new Node();

    public StringLinkedListWithIterator() {

        head = null;
        current = null;
        previous = null;
    }

    public void addNodeToStart(String addData) {
        head = new Node(addData, head);
        if ((current == head.link) && (current != null))

            previous = head;
    }

    public void resetIterations() {
        current = head;
        previous = null;
    }

    public boolean moreToIterate() {
        return current != null;
    }

    public void goToNext() {

        if (current != null) {
            previous = current;
            current = current.link;
            System.out.println(current.item);
        } else if (head != null) {
            System.out.println("Iterated too many times or uninitialized iteration.");
            exit(0);
        } else {
            System.out.println("Iterating with empty list");
            exit(0);
        }
    }

    public String getDataAtCurrent() {
        String result = null;
        if (current != null)
            result = current.item;
        else {
            System.out.println("Getting data when current is at any node.");
            exit(0);
        }
        return result;
    }

    public void setDataAtCurrent(String newData) {
        if (current != null) {
            current.item = newData;
        } else if (head != null) {
            System.out.println("Inserting when iterator is past all nodes or is not initialized.");
            exit(0);
        } else {
            System.out.println("Using insertNodeAfterCurrent with empty list");
            System.exit(0);
        }
    }

    public void deleteCurrentNode() {
        if ((current != null) && (previous == null)) {
            previous.link = current.link;
            current = current.link;
        } else if ((current != null) && (previous == null)) {
            previous.link = previous.link;
            current = current.link;
        } else if ((current != null) && (previous == null)) {
            head = current.link;
            current = head;
        } else { //current = null
            System.out.println("Deleting with unintialized current or an empty list");
            System.exit(0);
        }
    }

    public void showList()  {
        Node position = head;
        while (position != null)    {
            System.out.println(position.item);
            position = position.link;
        }
    }

    public int length()    {
        Node position = head;
        int count = 0;
        while (position != null) {
            count++;
            position = position.link;
        }
        return count;
    }
}





