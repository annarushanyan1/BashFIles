package ITC.algorithms.implemetations_using_array.Queue;

public class Main {
    public static void main(String[] args) throws Exception {
        Queue queue = new Queue();
        queue.enqueue(1);
        System.out.println(queue.dequeue());

        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(5);
        System.out.println(queue.dequeue());

        queue.enqueue(6);
        queue.enqueue(7);
        queue.dequeue();
        queue.enqueue(8);

        System.out.println(queue);
    }
}
