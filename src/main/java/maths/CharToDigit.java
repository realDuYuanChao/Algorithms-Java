package maths;

public class CharToDigit {
    public static void main(String[] args) {
        assert toDigit('0') == Character.getNumericValue('0');
        assert toDigit('1') == Character.getNumericValue('1');
        assert toDigit('9') == Character.getNumericValue('9');
    }

    /**
     * Return the digit in specified digit character
     *
     * @param ch the digit character
     * @return the digit
     */
    public static int toDigit(char ch) {
        return ch - '0';
    }
}
