package maths;

/**
 * @author https://github.com/shellhub
 */
public class MaxOfArray {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        assert findMax(array) == 10;
    }

    /**
     * Find max of in array
     *
     * @param array contains elements
     * @return max value of array
     */
    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1, size = array.length; i < size; ++i) {
            if (array[i] > max) { /* compare to max one by one */
                max = array[i];
            }
        }
        return max;
    }
}
