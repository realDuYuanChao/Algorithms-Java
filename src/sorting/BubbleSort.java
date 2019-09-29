package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};

        System.out.println("Before sorting:\n" + Arrays.toString(array));
        bubbleSort(array);
        System.out.println("After sorting:\n" + Arrays.toString(array));
    }

    /**
     * BubbleSort algorithm implement
     *
     * @param array to be sorted
     */
    public static void bubbleSort(int[] array) {
        for (int i = 0, size = array.length; i < size - 1; ++i) {
            boolean swapped = false;
            for (int j = 0; j < size - 1 - i; ++j) {
                if (array[j] > array[j + 1]) {
                    /* swap array[j],array[j + 1] */
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) { //array has been sorted
                break;
            }
        }
    }
}
