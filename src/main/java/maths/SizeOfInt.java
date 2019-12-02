package maths;

public class SizeOfInt {
    public static void main(String[] args) {
        assert size(0) == 1;
        assert size(10) == 2;
        assert size(123) == 3;
        assert size(1234) == 4;
        assert size(12345) == 5;
        assert size(123456) == 6;
        assert size(1234567) == 7;
        assert size(12345678) == 8;
        assert size(123456789) == 9;
        assert size(1234567890) == 10;
    }

    /**
     * Count the digits of a given number using recursion
     *
     * @param a the given number
     * @return the digits
     */
    public static int size(int a) {
        if (a < 10) {
            return 1;
        } else {
            return 1 + size(a / 10);
        }
    }
}
