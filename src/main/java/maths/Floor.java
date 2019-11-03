package maths;

public class Floor {
    public static void main(String[] args) {
        assert floor(10) == Math.floor(10);
        assert floor(-10) == Math.floor(-10);
        assert floor(10.0) == Math.floor(10.0);
        assert floor(-10.0) == Math.floor(-10.0);
        assert floor(10.1) == Math.floor(10.1);
        assert floor(-10.1) == Math.floor(-10.1);
        assert floor(0) == Math.floor(0);
        assert floor(-0) == Math.floor(-0);
        assert floor(0.0) == Math.floor(0.0);
        assert floor(-0.0) == Math.floor(-0.0);
    }

    /**
     * Returns the largest (closest to positive infinity)
     *
     * @param a a value
     * @return the largest (closest to positive infinity)
     */
    public static double floor(double a) {
        if (a - (int) a == 0) {
            return a;
        } else if (a - (int) a > 0) {
            return (int) a;
        } else {
            return (int) a - 1;
        }
    }
}
