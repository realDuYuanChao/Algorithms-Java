package maths;

public class MinOfArrayRecursion {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};

        assert min(array, 0, array.length - 1) == 1;
        assert min(array, array.length) == 1;
    }

    /**
     * find min value in array
     *
     * @param array contains elements
     * @param left  index of first elements
     * @param right index of last elements
     * @return min value in {@code array}
     */
    public static int min(int[] array, int left, int right) {
        if (left == right) {
            return array[left]; /* same as arr[right] */
        }

        /* the middle between left and right */
        int mid = (left + right) >> 1;

        /* find min number in range [left, mid] */
        int leftMin = min(array, left, mid);

        /* find min number in range [mid + 1, right] */
        int rightMin = min(array, mid + 1, right);

        return Math.min(leftMin, rightMin);
    }

    /**
     * Find min value in array
     *
     * @param array contains elements
     * @param len   the length of array
     * @return min value in {@code array}
     */
    public static int min(int[] array, int len) {
        return len == 1 ? array[0] : Math.min(min(array, len - 1), array[len - 1]);
    }
}
