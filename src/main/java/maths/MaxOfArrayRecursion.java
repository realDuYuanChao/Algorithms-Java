package maths;

public class MaxOfArrayRecursion {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};

        assert max(array, 0, array.length - 1) == 10;
        assert max(array, array.length) == 10;

    }

    /**
     * Find max value in array
     *
     * @param array contains elements
     * @param left  index of first elements
     * @param right index of last elements
     * @return max value in {@code array}
     */
    public static int max(int[] array, int left, int right) {
        if (left == right) {
            return array[left]; /* same as arr[right] */
        }

        /* the middle between left and right */
        int mid = (left + right) >> 1;

        /* find max number in range [left, mid] */
        int leftMax = max(array, left, mid);

        /* find max number in range [mid + 1, right] */
        int rightMax = max(array, mid + 1, right);

        return Math.max(leftMax, rightMax);
    }

    /**
     * Find max value in array
     *
     * @param array contains elements
     * @param len   the length of array
     * @return max value in {@code array}
     */
    public static int max(int[] array, int len) {
        return len == 1 ? array[0] : Math.max(max(array, len - 1), array[len - 1]);
    }
}
