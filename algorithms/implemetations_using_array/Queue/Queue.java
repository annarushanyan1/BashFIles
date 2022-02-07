package ITC.algorithms.implemetations_using_array.Queue;

import java.sql.Array;
import java.util.Arrays;

public class Queue{
    private int head;
    private static final int DEFAULT_CAPACITY = 10;
    private int[] array;
    public Queue(){
        head = -1;
        array = new int[DEFAULT_CAPACITY];
    }

    public boolean isFull(){
        return head + 1 == DEFAULT_CAPACITY;
    }

    public boolean isEmpty(){
        return head < 0;
    }

    public void enqueue(int value){

        if(!isFull()) {
            array[++head] = value;
        }


    }

    public int dequeue() {
        if(isEmpty()){
            return -1;
        }
        return array[head--];
    }

    @Override
    public String toString() {
        return "Queue{" +
                "head=" + head +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
