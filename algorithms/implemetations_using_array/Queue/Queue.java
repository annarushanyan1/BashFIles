package ITC.algorithms.implemetations_using_array.Queue;

import java.util.Arrays;


public class Queue <E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public Queue() {
        elements = new Object[DEFAULT_CAPACITY];
    }


    public void enqueue(Object obj) throws Exception {
        if (size == elements.length - 1) {
            throw new Exception("Queue is full.");
        }
        this.elements[size] = obj;
        this.size++;
    }
    public Object dequeue() throws Exception {
        if (isEmpty()){
            throw new Exception("Queue is empty");
        }

        Object obj = this.elements[0];

        for (int i = 0; i < this.size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        this.size--;
        return obj;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for(int i = 0; i < size ;i++) {
            sb.append(elements[i].toString());
            if(i < size-1){
                sb.append(",");
            }
        }
        sb.append(']');
        return sb.toString();
    }
}
