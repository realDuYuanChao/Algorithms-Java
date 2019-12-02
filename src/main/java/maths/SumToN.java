package maths;

public class SumToN {
    public static void main(String[] args) {
        assert sumToN(100) == 5050;
        assert sumToNRecursion(100) == 5050;
    }

    /**
     * Sum [1, 2, 3, 4....n]
     *
     * @param n the limitation
     * @return sum of <tt>1+2+3+4+...n</tt>
     */
    public static int sumToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; ++i) {
            sum += i;
        }
        return sum;
    }

    /**
     * Sum [1, 2, 3, 4....n] with recursion
     *
     * @param n the limitation
     * @return sum of <tt>1+2+3+4+...n</tt>
     */
    public static int sumToNRecursion(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sumToNRecursion(n - 1);
        }
    }
}
