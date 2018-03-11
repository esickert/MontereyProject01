package LinkedListSingle;

public class Node {

    private String stuff;
    private Node link;

    Node()  {
        stuff = null;   //constructor
        link = null;
    }

    Node(String newStuff, Node newLink) {
        this.stuff = newStuff;             //construtor
        this.link = newLink;
    }

    public void setStuff(String newStuff)   {
        stuff = newStuff;
    }

    public String getStuff()    {
        return stuff;
    }

    public void setLink(Node newLink)   {
        link = newLink;
    }

    public Node getLink() {
        return link;
    }
}
