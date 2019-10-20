package maths;

/**
 * @author https://github.com/shellhub
 */
public class MinOfArray {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        assert findMin(array) == 10;
    }

    /**
     * Find min of in array
     *
     * @param array contains elements
     * @return min value of array
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1, size = array.length; i < size; ++i) {
            if (array[i] < min) { /* compare to max one by one */
                min = array[i];
            }
        }
        return min;
    }
}
