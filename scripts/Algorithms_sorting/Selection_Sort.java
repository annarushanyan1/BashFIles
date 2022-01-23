package ITC.scripts.Algorithms_sorting;

import java.util.Arrays;

public class Selection_Sort {

    public static void main(String[] args) {
        int[] array = {5, 2, 3, 6, 32, 9, 54, 2, 3, 6, 30};
        int[] sorted_array = sorting(array);
        System.out.println(Arrays.toString(sorted_array));
    }

    public static int[] sorting(int[] arr) {
        int len = arr.length;

        if(len == 1){
            return arr;
        }
        int[] copy = new int[len];

        for (int i = 0; i < len; i++) {
            int[] someArray = findMin(arr);
            copy[i] = someArray[0];
            arr = removeTheElement(arr, someArray[1]);
        }
        return copy;
    }

    public static int[] findMin(int[] inputArray) {
        int index = 0;
        int minValue = inputArray[index];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < minValue) {
                minValue = inputArray[i];
                index = i;
            }
        }
        int[] minAndIndex = {minValue, index};
        return minAndIndex;
    }

    public static int[] removeTheElement(int[] arr, int index) {

        if (arr == null || index < 0 || index >= arr.length) {
            return arr;
        }

        int[] anotherArray = new int[arr.length - 1];

        for (int i = 0, k = 0; i < arr.length; i++) {

            if (i == index) {
                continue;
            }

            anotherArray[k++] = arr[i];
        }

        return anotherArray;
    }


}
