package maths;

/**
 * @author https://github.com/shellhub
 */

//fib: 1 1 2 3 5 8 13 21 ...
public class FibonacciRecursion {
    public static void main(String[] args) {

        /* top 10 items */
        for (int i = 1; i <= 10; ++i) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
