package ITC.implementations_by_JAVA.Queue;

public class Main {
    public static void main(String[] args) {
        Queue list = new Queue();

        System.out.println(list.isEmpty());
        System.out.println(list.SizeOfQueue());

        list.enqueue(11);
        list.enqueue(12);
        list.enqueue(13);
        list.enqueue(14);
        list.enqueue(15);

        list.printAll();

        System.out.println();

        list.dequeue();
        list.dequeue();

        list.printAll();

        System.out.println(list.SizeOfQueue());
        System.out.println(list.isEmpty());
    }

}
