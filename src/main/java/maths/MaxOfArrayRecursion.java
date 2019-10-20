package maths;

/**
 * @author https://github.com/shellhub
 */
public class MaxOfArrayRecursion {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};

        int left = 0;
        int right = array.length - 1;
        assert max(array, left, right) == 10;

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
}
