package LinkedListIterator;

public class TheLinkedListWithIteratorItself {
    public static void main(String[] args)  {

        StringLinkedListWithIterator dude = new StringLinkedListWithIterator();

        for(int i = 0; i <= 5; i++) {
            dude.addNodeToStart("trash"+i);
        }
        dude.showList();
        System.out.println("The number of items is: " + dude.length() );
        dude.resetIterations();
        System.out.println(dude.moreToIterate());

        while (dude.moreToIterate())    {
            System.out.println(dude.getDataAtCurrent());
        }



    }
}
