package maths;

public class Max {
    public static void main(String[] args) {
        for (int i = 3; i <= 3; ++i) {
            for (int j = 1; j <= 4; ++j) {
                assert max(i, j) == Math.max(i, j);
            }
        }
    }

    /**
     * Returns the greater of two {@code int} values
     *
     * @param a an argument
     * @param b the another argument
     * @return the larger of {@code a} and {@code b}
     */
    public static int max(int a, int b) {
        return a >= b ? a : b;
    }
}
