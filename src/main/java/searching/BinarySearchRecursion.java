package searching;

/**
 * @author https://github.com/shellhub
 */

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 5;
        int low = 0;
        int high = array.length - 1;

        int position = binarySearch(array, key, low, high);
        if (position != -1) {
            System.out.println(key + " locate at " + position);
        } else {
            System.out.println(key + " not found");
        }
    }

    /**
     * BinarySearch algorithm implements
     *
     * @param array contains elements
     * @param key   to be searched
     * @param low   the index of first element
     * @param high  the index of last element
     * @return the index of {@code key} if found, otherwise {@value -1}
     */
    public static int binarySearch(int[] array, int key, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) >>> 1;
        int midVal = array[mid];
        if (key == midVal) {
            return mid; /* found key */
        } else if (key > midVal) {
            return binarySearch(array, key, mid + 1, high); /* search in [mid + 1, high] */
        } else { /* key < midVal */
            return binarySearch(array, key, low, mid - 1); /* search in [low, mid - 1] */
        }
    }
}
