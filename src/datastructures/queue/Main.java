package datastructures.queue;

public class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue(4);

        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();

        myQueue.printQueue();
        System.out.println("-----------------------------");

        System.out.println("Enqueue");
        myQueue.enqueue(5);
        myQueue.enqueue(2);
        myQueue.printQueue();
        System.out.println("------------------------------");

        System.out.println("Dequeue");
        System.out.println("Dequeued item: " + myQueue.dequeue().value);
        myQueue.printQueue();
    }
}
