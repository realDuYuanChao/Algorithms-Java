package maths;

public class DigitToChar {
    public static void main(String[] args) {
        char[] digitChar = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0; i <= 9; ++i) {
            assert toChar(i) == digitChar[i];
        }
    }

    /**
     * Convert specified digit to char
     *
     * @param digit the digit
     * @return digit character
     */
    public static char toChar(int digit) {
        if (digit < 0 || digit > 9) {
            throw new IllegalArgumentException("digit should be in [0, 9]");
        }
        return (char) ('0' + digit);
    }
}
