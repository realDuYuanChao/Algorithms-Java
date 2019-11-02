package arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        assert Arrays.equals(reverse(new Integer[]{1, 2, 3, 4, 5}), new Integer[]{5, 4, 3, 2, 1});
        assert Arrays.equals(reverse(new Character[]{'A', 'B', 'C', 'D', 'E'}), new Character[]{'E', 'D', 'C', 'B', 'A'});
        assert Arrays.equals(reverse(new String[]{"aa", "bb", "cc", "dd", "ee"}), new String[]{"ee", "dd", "cc", "bb", "aa"});
    }

    /**
     * Reverse array
     *
     * @param objects to be reversed
     */
    public static Object[] reverse(Object[] objects) {
        for (int i = 0, length = objects.length, limit = length / 2; i < limit; i++) {
            Object temp = objects[i];
            objects[i] = objects[length - 1 - i];
            objects[length - 1 - i] = temp;
        }
        return objects;
    }
}
