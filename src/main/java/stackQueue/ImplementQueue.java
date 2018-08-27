package stackQueue;

public class ImplementQueue {
    public static void main(String[] args) {

        Queue myQueue = new Queue();

        System.out.println(myQueue.isEmpty());
        System.out.println(myQueue.size());

        myQueue.queue(100);
        System.out.println(myQueue.size());
        myQueue.dequeue();
        System.out.println(myQueue.size());

    }
}
