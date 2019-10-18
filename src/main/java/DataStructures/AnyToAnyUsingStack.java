package DataStructures;

import java.util.Stack;

public class AnyToAnyUsingStack {
    public static void main(String[] args) {
        assert convert(0, 2).equals("0");
        assert convert(30, 2).equals("11110");
        assert convert(30, 8).equals("36");
        assert convert(30, 10).equals("30");
        assert convert(30, 16).equals("1E");
    }

    /**
     * Convert decimal number to another radius
     *
     * @param number the number to be converted
     * @param radius the radius
     * @return another radius
     * @throws ArithmeticException if <tt>number</tt> or <tt>radius</tt> is invalid
     */
    private static String convert(int number, int radius) {
        if (number < 0 || radius < 2 || radius > 16) {
            throw new ArithmeticException(
                    String.format("Invalid input -> number:%d,radius:%d", number, radius));
        }
        char[] tables = {
                '0', '1', '2', '3', '4',
                '5', '6', '7', '8', '9',
                'A', 'B', 'C', 'D', 'E', 'F'
        };
        Stack<Character> bits = new Stack<>();
        do {
            bits.push(tables[number % radius]);
            number = number / radius;
        } while (number != 0);

        StringBuilder result = new StringBuilder();
        while (!bits.isEmpty()) {
            result.append(bits.pop());
        }
        return result.toString();
    }
}
