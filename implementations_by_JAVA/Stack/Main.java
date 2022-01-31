package ITC.scripts.implementations_by_JAVA.Stack;

public class Main {

    public static void main(String[] args) {
        Stack list = new Stack();
        System.out.println(list.isEmpty());
        list.push(11);
        list.push(22);
        list.push(33);
        list.push(44);
        list.push(55);
        list.push(66);

        list.printAll();

        System.out.println();
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println();

        System.out.println("making peeking");
        System.out.println(list.peek());
        System.out.println(list.peek());
        System.out.println();

        list.printAll();

        System.out.println(list.isEmpty());

    }
}
