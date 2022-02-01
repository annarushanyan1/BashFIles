package ITC.algorithms.Algorithms_sorting;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] array = {5, 2, 3, 6, 32, 9, 54, 2, 3, 6, 30};
        int[] sorted_array = SelectionSort(array);
        System.out.println(Arrays.toString(sorted_array));
    }

    public static int[] SelectionSort(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}