package ITC.algorithms.implemetations_using_array.Queue;

import java.sql.Array;
import java.util.Arrays;

public class Queue{
    private int head = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private int[] array;
    public Queue(){
        head = -1;
        array = new int[DEFAULT_CAPACITY];
    }

    public boolean isFull(){
        return array.length == DEFAULT_CAPACITY;
    }

    public void enqueue(int value){
        if(isFull()){
            return;
        }
        head++;
        array[head] = value;

    }

    public int dequeue() {
        int dequeued = array[head];
        head--;
        return dequeued;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "head=" + head +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
