package arrays;

public class SumOfArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assert sum(nums) == 55;
        assert sum(nums, 0, nums.length - 1) == 55;
        assert sum(nums, nums.length) == 55;
    }

    /**
     * Get sum of array
     *
     * @param nums contains numbers
     * @return sum of {@code nums}
     */
    public static int sum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    /**
     * Get sum of array using Divide-and-conquer algorithm
     *
     * @param nums contains numbers
     * @param low  the low index
     * @param high the high index
     * @return sum of {@code nums}
     */
    public static int sum(int[] nums, int low, int high) {
        if (low == high) {
            return nums[low]; //or nums[high]
        }
        int mid = (low + high) >>> 1;
        return sum(nums, low, mid) + sum(nums, mid + 1, high);
    }

    /**
     * Get sum of array using recursion
     *
     * @param nums contains numbers
     * @param len  the length of numbers
     * @return sum of {@code nums}
     */
    public static int sum(int[] nums, int len) {
        if (len == 1) {
            return nums[0];
        } else {
            return nums[len - 1] + sum(nums, len - 1);
        }
    }
}
