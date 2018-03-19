package LinkedListIterator;

public class Node {

    protected String item;
    protected Node link;

    Node()  {
        item = null;
        link = null;
    }

    Node(String newItem, Node newLink)    {
        this.item = newItem;
        this.link = newLink;
    }

    public void setItem(String newItem) {
        this.item = newItem;
    }

    public String getItem() {
        return item;
    }

    public void setLink(Node link) {
        this.link = link;
    }

    public Node getLink() {
        return link;
    }
}
