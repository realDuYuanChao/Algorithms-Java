package maths;

/**
 * @author https://github.com/shellhub/
 */
public class GCD {
    public static void main(String[] args) {
        assert gcd(20, 10) == 5;
        assert gcd(10, 2) == 2;
        assert gcd(10, 5) == gcd(5, 10);
    }

    /**
     * Get greatest common divisor
     *
     * @param a the first number
     * @param b the second number
     * @return gcd
     */
    public static int gcd(int a, int b) {

        if (a < 0 || b < 0) {
            throw new ArithmeticException();
        }

        if (a == 0 || b == 0) {
            return Math.abs(a - b);
        }

        while (a % b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return b;
    }
}
