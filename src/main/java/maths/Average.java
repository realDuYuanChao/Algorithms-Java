package maths;

public class Average {
    public static void main(String[] args) {
        assert 12.0 == getAverage(new int[]{3, 6, 9, 12, 15, 18, 21});
        assert 20 == getAverage(new int[]{5, 10, 15, 20, 25, 30, 35});
        assert 4.5 == getAverage(new int[]{1, 2, 3, 4, 5, 6, 7, 8});

    }

    /**
     * Return the average of nums
     *
     * @param nums the numbers
     * @return the average of numbers
     */
    public static double getAverage(int[] nums) {
        double sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum / nums.length;
    }
}
