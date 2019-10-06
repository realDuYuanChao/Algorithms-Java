package sorting;

import java.util.Arrays;

public class InsertSort {

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};

        System.out.println("Before sorting:\n" + Arrays.toString(array));
        insertSort(array);
        System.out.println("After sorting:\n" + Arrays.toString(array));
    }

    /**
     * Insert Sort algorithm implements
     *
     * @param array to be sorted
     */
    public static void insertSort(int[] array) {
        for (int i = 1, size = array.length; i < size; ++i) {
            int insertValue = array[i];
            int j = i - 1;
            while (j >= 0 && insertValue < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = insertValue;
        }
    }
}
