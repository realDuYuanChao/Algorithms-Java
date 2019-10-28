package searching;

public class JumpSearch {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < array.length; i++) {
            assert search(array, i) == i;
        }
        assert search(array, -1) == -1;
        assert search(array, 11) == -1;
    }

    /**
     * Jump Search algorithm implements
     *
     * @param array the array contains elements
     * @param key   to be searched
     * @return index of {@code key} if found, otherwise <tt>-1</tt>
     */
    public static int search(int[] array, int key) {
        int length = array.length; /* length of array */
        int blockSize = (int) Math.sqrt(length); /* block size to be jumped */

        int limit = blockSize;
        while (key > array[limit] && limit < array.length - 1) {
            limit = Math.min(limit + blockSize, array.length - 1);
        }

        for (int i = limit - blockSize; i <= limit; i++) {
            if (array[i] == key) { /* execute linear search */
                return i;
            }
        }
        return -1; /* not found */
    }
}
