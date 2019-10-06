package searching;

/**
 * @author https://github.com/shellhub
 */
public class LinearSearchRecursion {
    public static void main(String[] args) {

        int[] array = {1, 3, 5, 7, 100, 2, 4, 6, 8, 10};
        int key = 100;
        int low = 0;
        int high = array.length - 1;

        int position = search(array, key, low, high);
        if (position != -1) {
            System.out.println(key + " locate at " + position);
        } else {
            System.out.println(key + " not found");
        }
    }

    /**
     * LinearSearch algorithm using recursion
     *
     * @param array contains elements
     * @param key   to be searched
     * @param low   the first index
     * @param high  the last index
     * @return the index of {@code key} if found, otherwise {@value -1}
     */
    public static int search(int[] array, int key, int low, int high) {
        if (low > high) {
            return -1;
        } else if (array[low] == key) {
            return low;
        } else {
            return search(array, key, low + 1, high);
        }
    }
}
