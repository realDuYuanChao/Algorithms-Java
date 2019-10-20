package maths;

/**
 * @author https://github.com/shellhub
 */
public class AbsoluteValue {
    public static void main(String[] args) {
        assert abs(0) == 0;
        assert abs(-1) == 1;
        assert abs(1) == 1;
    }

    /**
     * calculate absolute value
     *
     * @param a the number
     * @return the absolute value of <tt>a</tt>
     */
    public static int abs(int a) {
        return a < 0 ? -a : a;
    }
}
