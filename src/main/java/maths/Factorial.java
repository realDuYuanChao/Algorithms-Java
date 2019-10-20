package maths;

/**
 * @author https://github.com/shellhub
 */
public class Factorial {
    public static void main(String[] args) {
        assert factorial(0) == 1;
        assert factorial(1) == 1;
        assert factorial(3) == 6;
        assert factorial(5) == 120;
    }

    /**
     * calculate factorial
     *
     * @param n the number
     * @return the factorial of <tt>n</tt>
     */
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(n + " < 0");
        }
        long fac = 1;
        for (int i = 1; i <= n; ++i) {
            fac *= i;
        }
        return fac;
    }
}
