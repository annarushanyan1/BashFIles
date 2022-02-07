package ITC.algorithms.implemetations_using_array.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        System.out.println(stack.pop());

        stack.push(2);
        stack.push(3);
        stack.push(5);
        System.out.println(stack.pop());

        stack.push(6);
        stack.push(7);
        stack.pop();
        stack.push(8);

        System.out.println(stack);
    }
}
