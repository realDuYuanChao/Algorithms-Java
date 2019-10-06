package leetcode;

/**
 * link:https://leetcode.com/problems/reverse-integer/
 * <p>
 * Given a 32-bit signed integer, reverse digits of an integer.
 * <p>
 * Example 1:
 * <p>
 * Input: 123
 * Output: 321
 * Example 2:
 * <p>
 * Input: -123
 * Output: -321
 * Example 3:
 * <p>
 * Input: 120
 * Output: 21
 */
public class ReverseInteger {
    public static void main(String[] args) {
        int[] nums = {123, -123, 120, 1534236469};
        for (int num : nums) {
            System.out.println(num + " -> " + reverse(num));
        }
    }

    /**
     * Reverse an integer number
     *
     * @param x to reverse
     * @return reversed of {@code x}
     */
    public static long reverse(int x) {
        boolean isNegative = x < 0;
        x = isNegative ? -x : x;

        int reverseNumber = 0;
        while (x != 0) {
            int remainder = x % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            x /= 10;
        }

        return isNegative ? -reverseNumber : reverseNumber;
    }
}
