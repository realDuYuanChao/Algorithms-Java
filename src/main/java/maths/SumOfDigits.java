package maths;

public class SumOfDigits {
    public static void main(String[] args) {
        assert sum(0) == 0;
        assert sum(1) == 1;
        assert sum(12) == 3;
        assert sum(123) == 6;
        assert sum(1234) == 10;
        assert sum(12345) == 15;
        assert sum(123456) == 21;
        assert sum(1234567) == 28;
    }

    /**
     * Sum digits of a given number
     *
     * @param a the number
     * @return sum of digits
     */
    public static int sum(int a) {
        if (a < 10) {
            return a;
        } else {
            return a % 10 + sum(a / 10);
        }
    }
}
