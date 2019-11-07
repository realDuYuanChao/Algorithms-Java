package maths;

public class StringSize {
    public static void main(String[] args) {
        assert stringSize(0) == 1;
        assert stringSize(1) == 1;
        assert stringSize(88) == 2;
        assert stringSize(888) == 3;
        assert stringSize(8888) == 4;
        assert stringSize(88888) == 5;
    }

    /**
     * Calculate size of {@code int}
     *
     * @param x the number
     * @return size of int
     */
    public static int stringSize(int x) {
        final int[] sizeTable = {9, 99, 999, 9999, 99999, 999999, 9999999,
                99999999, 999999999, Integer.MAX_VALUE};
        for (int i = 0; ; ++i) {
            if (x <= sizeTable[i]) {
                return i + 1;
            }
        }
    }
}
