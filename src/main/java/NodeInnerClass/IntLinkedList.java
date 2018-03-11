package NodeInnerClass;

public class IntLinkedList {

    private Node head = null;

    public int length()    {  ///////Wrong
        Node position = head;
        int count = 0;
        while (position != null)    {
            position = position.link;

            count++;
        }
        return count;
    }

    public void addNode(int addData)   {
 //       Node position = head;
        head = new Node(addData, head);
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
