package ITC.algorithms.implemetations_using_array.Queue;

public class Main {
    public static void main(String[] args) throws Exception {
        Queue queue = new Queue();
        queue.enqueue("1");
        System.out.println(queue.dequeue());

        queue.enqueue("2");
        queue.enqueue("3");
        queue.enqueue("4");
        System.out.println(queue.dequeue());

        queue.enqueue("5");
        queue.enqueue("6");
        queue.enqueue("7");
        queue.enqueue("8");
        queue.dequeue();
        System.out.println(queue);
    }
}
