package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};

        System.out.println("Before sorting:\n" + Arrays.toString(array));
        selectionSort(array);
        System.out.println("After sorting:\n" + Arrays.toString(array));
    }

    /**
     * Selection Sort algorithm implements
     *
     * @param array to be sorted
     */
    public static void selectionSort(int[] array) {
        for (int i = 0, size = array.length; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; ++j) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }

            /* make array[i] to smallest in range [i+1, size - 1] */
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
}
