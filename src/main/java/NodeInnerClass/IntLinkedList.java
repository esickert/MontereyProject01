package NodeInnerClass;

public class IntLinkedList {

    private Node head = null;

    //return the length of the list
    public int length()    {
        Node position = head;
        int count = 0;
        while (position != null)    {
            position = position.link;
            count++;
        }
        return count;
    }

       // add ndoe to beginning of list
    public void addNode(int addData)   {
 //       Node position = head;
        head = new Node(addData, head);
    }

    public void printList() {
        Node position = head;
        while (position != null) {
            System.out.print(position.num + " ");
            position = position.link;
        }
    }

    private class Node {

        int num;
        Node link;

        Node()  {
            num = 0;
            link = null;
        }

        Node(int newNum, Node newLink) {
            this.num = newNum;
            this.link = newLink;
        }
/**************************************************************************************
        public void setNum(int newNum) {
            num = newNum;
        }

        public int getNum() {
            return num;
        }

        public void setLink(Node newLink)    {
            link = newLink;
        }

        public Node getLink()   {
            return link;
        }
 ***************************************************************************************/
    }//end of class Node
}
