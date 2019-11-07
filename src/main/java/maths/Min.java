package maths;

public class Min {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; ++i) {
            for (int j = 1; j <= 4; ++j) {
                assert min(i, j) == Math.min(i, j);
            }
        }
    }

    /**
     * Return smaller of two {@code int}
     *
     * @param a a argument
     * @param b the another argument
     * @return the smaller {@code a} and {@code b}
     */
    public static int min(int a, int b) {
        return a <= b ? a : b;
    }
}
