package stackQueue;

public class ImplementQueue {
    public static void main(String[] args) {

        Queue myQueue = new Queue();

        System.out.println(myQueue.isEmpty());
        System.out.println(myQueue.size());

        myQueue.queue(100);
        myQueue.queue(200);
        myQueue.queue(300);
        System.out.println(myQueue.size());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.size());

    }
}
