package maths;

/**
 * @author https://github.com/shellhub
 */

//fib: 1 1 2 3 5 8 13 21 ...
public class Fibonacci {
    public static void main(String[] args) {

        /* top 10 items */
        fibonacci(10);
    }

    /**
     * Print top {@code n} items of fibonacci
     *
     * @param n top items
     */
    public static void fibonacci(int n) {
        int a = 1;
        int b = 2;
        for (int i = 1; i <= n; ++i) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
