package ITC.scripts.implementations_by_JAVA.Queue;

public class Queue {
    Node root;
    int size;

    public void enqueue(int element)
    {
        Node newNode = new Node(element);
        if (root == null) {
            root = newNode;
            size++;
            return;
        }else{
            Node temp = root;
            newNode.next = temp;
            root = newNode;
        }
        size++;

    }
    public void dequeue()
    {
       int count = 0;
       Node temp = root;
       while(count != size - 1)
       {
           temp = temp.next;
           count++;
       }
       temp.next = null;
       size--;
    }

    public void printAll()
    {
        int count = size;
        Node temp = root;
        int [] array = new int[size];
        while(count != 0)
        {
            array[count-1] = temp.data;;
            temp = temp.next;
            count--;
        }
        for (int item : array){
            System.out.println(item);
        }
    }

    public int SizeOfQueue()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return  size != 0;
    }

}
