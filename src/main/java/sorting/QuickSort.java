package sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};

        System.out.println("Before sorting:\n" + Arrays.toString(array));

        int low = 0;
        int high = array.length - 1;
        quickSort(array, low, high);

        System.out.println("After sorting:\n" + Arrays.toString(array));
    }

    public static void quickSort(int[] array, int low, int high) {

        if (low >= high) {
            return;
        }

        int mid = (low + high) >> 1;
        int pivot = array[mid];

        int i = low;
        int j = high - 1;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }

            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        //TODO
    }

}
