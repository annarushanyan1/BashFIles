package ITC.algorithms.implemetations_using_array.Queue;

import java.sql.Array;
import java.util.Arrays;

public class Queue{
    private int head;
    private int tail;
    private int size;
    private static final int DEFAULT_CAPACITY = 6;
    private int[] array;

    public Queue(){
        array = new int[DEFAULT_CAPACITY];
        head = 0;
        tail = -1;
    }

    public void enqueue(int item)
    {
        if (isFull())
        {
            System.out.println("isFull");
            System.exit(-1);
        }

        tail = (tail + 1) % DEFAULT_CAPACITY;
        array[tail] = item;
        size++;
    }

    public int dequeue()
    {
        if (isEmpty())
        {
            System.out.println("isEmpty");
            return -1;
        }

        int x = array[head];

        System.out.println("Removing " + x);

        head = (head + 1) % DEFAULT_CAPACITY;
        size--;

        return x;
    }


    public boolean isFull() {
        return size == DEFAULT_CAPACITY;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "head=" + head +
                ", tail=" + tail +
                ", size=" + size +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
