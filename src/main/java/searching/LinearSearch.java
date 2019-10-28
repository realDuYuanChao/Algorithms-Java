package searching;

/**
 * @author https://github.com/shellhub
 */
public class LinearSearch {
    public static void main(String[] args) {

        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < array.length; ++i) {
            assert search(array, i) == i;
        }
        assert search(array, -1) == -1;
        assert search(array, 11) == -1;
    }

    /**
     * Search index of key value
     *
     * @param array contains elements
     * @param key   to be searched
     * @return index of {@code key}
     */
    public static int search(int[] array, int key) {
        for (int i = 0, length = array.length; i < length; ++i) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1; /* not found */
    }
}
