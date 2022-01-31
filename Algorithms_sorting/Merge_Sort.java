package ITC.scripts.Algorithms_sorting;

import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        int[] array = new int[]{5, 6, 7, 2, 4, 1, 3};
        mergeSort(array,array.length);
        System.out.println(Arrays.toString(array));
    }
    public static void mergeSort(int[] array, int n) {
        if (n < 2) {
            return;
        }

        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = array[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = array[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(array, l, r, mid, n - mid);
    }

    public static void merge(int[] a, int[] l, int[] r, int leftLength, int rightLength) {

        int i = 0, j = 0, k = 0;

        while (i < leftLength && j < rightLength) {
            if (l[i] <= r[j]) {
                a[k] = l[i];
                k+=1;
                i+=1;
            }
            else {
                a[k] = r[j];
                k+=1;
                j+=1;
            }
        }
        while (i < leftLength) {
            a[k++] = l[i++];
        }
        while (j < rightLength) {
            a[k++] = r[j++];
        }
    }
}