package maths;

public class Ceil {
    public static void main(String[] args) {
        assert ceil(10) == Math.ceil(10);
        assert ceil(-10) == Math.ceil(-10);
        assert ceil(10.0) == Math.ceil(10.0);
        assert ceil(-10.0) == Math.ceil(-10.0);
        assert ceil(10.1) == Math.ceil(10.1);
        assert ceil(-10.1) == Math.ceil(-10.1);
        assert ceil(0) == Math.ceil(0);
        assert ceil(-0) == Math.ceil(-0);
        assert ceil(0.0) == Math.ceil(0.0);
        assert ceil(-0.0) == Math.ceil(-0.0);
    }

    /**
     * Returns the smallest (closest to negative infinity)
     *
     * @param a a value
     * @return the smallest (closest to negative infinity)
     */
    public static double ceil(double a) {
        if (a - (int) a == 0) {
            return a;
        } else if (a - (int) a > 0) {
            return (int) (a + 1);
        } else {
            return (int) a;
        }
    }
}
