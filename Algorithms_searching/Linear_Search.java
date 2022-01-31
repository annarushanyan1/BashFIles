package ITC.scripts.Algorithms_searching;

public class Linear_Search {

    public static void main(String a[]){
        int[] a1= {10,20,30,50,70,90};
        int key = 50;
        int result = linearSearch(a1, key);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at " + "index " + result);
        }
    }

    public static int linearSearch(int[] arr, int key){
    for(int i = 0;i < arr.length;i++){
        if(arr[i] == key){
            return i;
        }
    }
    return -1;
}
}
