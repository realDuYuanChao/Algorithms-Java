package searching;

/**
 * @author https://github.com/shellhub
 */
public class LinearSearch {
    public static void main(String[] args) {

        int[] array = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        int key = 7;

        int position = search(array, key);
        if (position != -1) {
            System.out.println(key + " locate at " + search(array, key));
        } else {
            System.out.println(key + " not found");
        }
    }

    /**
     * search index of key value
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
