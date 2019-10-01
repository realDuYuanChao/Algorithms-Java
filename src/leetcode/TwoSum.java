package leetcode;

/**
 * link: https://leetcode.com/problems/two-sum/
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * Example:
 * <p>
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = new TwoSum().twoSum(nums, target);
        if (result != null) {
            System.out.format("nums[%d] + nums[%d] = %d + %d = %d\n",
                    result[0], result[1], nums[result[0]], nums[result[1]], target);
        } else {
            System.out.println("target not found.");
        }
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0, length = nums.length; i < length - 1; ++i) {
            for (int j = i + 1; j < length; ++j) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }
}
