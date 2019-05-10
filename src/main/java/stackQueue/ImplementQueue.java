package stackQueue;

public class ImplementQueue {
    public static void main(String[] args) {

        Queue myQueue = new Queue();

        System.out.println(myQueue.isEmpty());
        System.out.println(myQueue.size());
        //********************************************************




        myQueue.enqueue(100);
        myQueue.enqueue(200);
        myQueue.enqueue(300);//*****
        //********************************************************
        System.out.println(myQueue.size());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.size());
        System.out.println(myQueue.front());

    }
}
