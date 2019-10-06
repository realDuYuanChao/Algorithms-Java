package maths;

/**
 * @author https://github.com/shellhub
 */
public class AbsoluteValue {
    public static void main(String[] args) {
        int[] numbers = {1, -1, 0};
        for (int number : numbers) {
            System.out.format("abs(%d)=%d\n", number, abs(number));
        }
    }

    /**
     * calculate absolute value
     *
     * @param a the number
     * @return the absolute value of {@code a}
     */
    public static int abs(int a) {
        return a < 0 ? -a : a;
    }
}
