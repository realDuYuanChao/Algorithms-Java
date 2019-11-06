package arrays;

import java.util.Arrays;

/**
 * Merge two array to sorted
 * Examples:
 * arr1[] = {1, 3, 2, 1}
 * arr2[] = {1, 4, 2, 3}
 * merge arr1 and arr2 get result: arr3[] = {1, 1, 1, 2, 2, 3, 3, 4}
 */
public class MergeTwoArraySorted {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(merge(new int[]{1, 3, 2, 1}, new int[]{1, 4, 2, 3})));
    }

    /**
     * Insert element to array always sorted
     *
     * @param array the array
     * @param key   inserted value
     * @param count the end
     */
    public static void insertSorted(int[] array, int key, int count) {
        int j = count - 1;
        while (j >= 0 && key < array[j]) {
            array[j + 1] = array[j];
            j--;
        }
        array[j + 1] = key;
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] array = new int[arr1.length + arr2.length];
        int count = 0;

        for (int key : arr1) {
            insertSorted(array, key, count);
            count++;
        }

        for (int key : arr2) {
            insertSorted(array, key, count);
            count++;
        }
        return array;
    }
}
