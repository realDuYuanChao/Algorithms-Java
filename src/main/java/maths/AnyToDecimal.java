package maths;

public class AnyToDecimal {
    public static void main(String[] args) {
        assert toDecimal("1010", 2) == Integer.valueOf("1010", 2);
        assert toDecimal("777", 8) == Integer.valueOf("777", 8);
        assert toDecimal("999", 10) == Integer.valueOf("999", 10);
        assert toDecimal("ABCDEF", 16) == Integer.valueOf("ABCDEF", 16);
        assert toDecimal("XYZ", 36) == Integer.valueOf("XYZ", 36);
    }

    /**
     * Convert any radix to decimal number
     *
     * @param bits  the string to be convert
     * @param radix the radix
     * @return decimal of bits
     * @throws NumberFormatException if {@code bits} or {@code radix} is invalid
     */
    public static int toDecimal(String bits, int radix) {
        final int MIN_RADIX = 2; /* min radix */
        final int MAX_RADIX = 36; /* max radix */

        if (radix < MIN_RADIX || radix > MAX_RADIX) {
            throw new NumberFormatException("For input radix: " + radix);
        }

        int count = 0;

        int sum = 0;
        for (int i = bits.length() - 1; i >= 0; --i) {
            int digit = toInt(bits.charAt(i));
            if (digit >= radix) {
                throw new NumberFormatException("For input string " + bits);
            }
            sum = sum + toInt(bits.charAt(i)) * (int) Math.pow(radix, count++);
        }
        return sum;
    }

    /**
     * Convert character to integer
     *
     * @param ch the character
     * @return represented digit of character
     * @throws NumberFormatException if {@code ch} is not UpperCase or Digit character.
     */
    public static int toInt(char ch) {
        if (!(Character.isUpperCase(ch) || Character.isDigit(ch))) {
            throw new NumberFormatException("invalid char :" + ch);
        }
        return Character.isDigit(ch) ? ch - '0' : ch - 'A' + 10;
    }

}
