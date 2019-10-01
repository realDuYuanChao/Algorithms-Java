package maths;

/**
 * @author https://github.com/shellhub
 */
public class MinOfArrayRecursion {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};

        int left = 0;
        int right = array.length - 1;
        System.out.println("min = " + min(array, left, right)); /* output: 1*/

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
}