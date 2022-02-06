package ITC.algorithms.implementations_by_JAVA.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap myHashmap = new HashMap();
        myHashmap.put(new Key(10),new Value(20));
        myHashmap.put(new Key(20),new Value(40));
        myHashmap.put(new Key(30),new Value(60));
        myHashmap.put(new Key(10),new Value(50));


        myHashmap.remove(new Key(20));
        System.out.println(myHashmap.containsKey(new Key(30)));
        System.out.println(myHashmap.get(new Key(10)).getValue());
        System.out.println(myHashmap.get(new Key(30)).getValue());
    }
}
