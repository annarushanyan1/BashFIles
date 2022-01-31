package ITC.Algorithms_sorting;
import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] array = {5,2,3,6,32,9,54,2,3,6,30};
        int[] sorted_array = sorting(array);
        System.out.println( Arrays.toString( sorted_array ));
    }

    public static int[] sorting(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;

    }
}
