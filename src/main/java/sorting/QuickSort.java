package sorting;

import java.util.Arrays;

/**
 * @author shellhub
 */

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};

        System.out.println("Before sorting:\n" + Arrays.toString(array));

        int low = 0;
        int high = array.length - 1;
        quickSort(array, low, high);

        System.out.println("After sorting:\n" + Arrays.toString(array));
    }

    /**
     * swap value at index {@code i} and {@code j}
     *
     * @param array contains elements
     * @param i     the first index
     * @param j     the second index
     */
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * QuickSort algorithm implements
     *
     * @param array @param array contains elements
     * @param low   the index of first element
     * @param high  the index of last element
     */
    public static void quickSort(int[] array, int low, int high) {

        if (low >= high) {
            return;
        }

        int pivot = array[high]; /* pick last element as pivot */


        /* partition */
        int i = low;
        int j = high - 1;
        while (i < j) {
            while (array[i] < pivot) {
                i++; /* move i forward */
            }
            while (j > 0 && array[j] > pivot) {
                j--; /* move j backward */
            }
            if (i < j) {
                swap(array, i, j);
            }
        }
        swap(array, i, high);


        quickSort(array, low, i - 1);
        quickSort(array, i + 1, high);
    }

}
