package searching;

/**
 * @author https://github.com/shellhub
 */

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < array.length; ++i) {
            assert binarySearch(array, i) == i;
        }
        assert binarySearch(array, -1) == -1;
        assert binarySearch(array, 11) == -1;
    }

    /**
     * BinarySearch algorithm implements
     *
     * @param array contains elements
     * @param key   to be searched
     * @return the index of {@code key} if found, otherwise {@value -1}
     */
    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) >> 1; /* the mid [low, high] */
            int midVal = array[mid];

            if (key == midVal) {
                return mid; /* found */
            } else if (key > midVal) {
                low = mid + 1; /* search in [mid + 1, high] */
            } else { /* key < midVal */
                high = mid - 1; /* search in [low, mid -1] */
            }
        }
        return -1; /* not found */
    }
}
