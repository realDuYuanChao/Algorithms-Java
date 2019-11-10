package sorting;

import java.util.Arrays;

public class BubbleSortOdd {
    public static void main(String[] args) {
        int[][] numbers = {
                {1, 10, 3, 8, 4, 6, 7},
                {1, 10, 3, 8, 4},
                {1, 10, 3, 8},
                {1, 10, 3},
                {1, 10},
                {1}
        };
        String[] sorted = {
                "[1, 6, 3, 8, 4, 10, 7]",
                "[1, 8, 3, 10, 4]",
                "[1, 8, 3, 10]",
                "[1, 10, 3]",
                "[1, 10]",
                "[1]"
        };

        for (int i = 0; i < numbers.length; ++i) {
            sort(numbers[i]);
            assert Arrays.toString(numbers[i]).equals(sorted[i]);
        }
    }

    /**
     * Bubble sort only sort odd index of array
     *
     * @param array the array to sort
     */
    public static void sort(int[] array) {
        for (int i = 1; i < array.length - 1; i += 2) {
            boolean swapped = false;
            for (int j = 1; j + 2 < array.length; j += 2) {
                if (array[j] > array[j + 2]) {
                    int temp = array[j];
                    array[j] = array[j + 2];
                    array[j + 2] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
