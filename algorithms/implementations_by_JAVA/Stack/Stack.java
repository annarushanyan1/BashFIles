package ITC.algorithms.implementations_by_JAVA.Stack;

public class Stack {
    Node root;
    int size = 0;

    public void push(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        } else {
            Node temp = root;//all
            root = newNode;//new aysinqn push yracy kyama amena tiery
            newNode.next = temp;
        }
        size++;
    }

    public int pop()//is removign last element
    {
        int popped = Integer.MIN_VALUE;
        if (root == null) {
            System.out.println("ITC.scripts.implementations_by_JAVA.Stack is Empty");
        }
        else {
            popped = root.data;
            root = root.next;
        }
        size--;
        return popped;
    }

    public int peek()
    {
        //is geting the last element of the stack, without deleting from collection
        if (root == null) {
            System.out.println("ITC.scripts.implementations_by_JAVA.Stack is empty");
            return Integer.MIN_VALUE;
        }
        else {
            return root.data;//55
        }
    }

    public void printAll()
    {
        int count = 0;
        Node temp = root;
        while(count != size)
        {
            if(temp == null)
            {
                return;
            }
            System.out.println(temp.data);
            temp = temp.next;
            count++;
        }
    }

    public boolean isEmpty()
    {
        if (root == null) {
            return true;
        }
        else
            return false;
    }

}
