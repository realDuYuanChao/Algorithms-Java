package maths;

/**
 * @author https://github.com/shellhub
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.println("5! = " + factorial(5)); /* output: 120 */
    }

    /**
     * calculate factorial
     *
     * @param n the number
     * @return the factorial of {@code n}
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
