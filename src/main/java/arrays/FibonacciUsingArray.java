package arrays;

//fib: 1 1 2 3 5 8 13 21 ...
public class FibonacciUsingArray {
    public static void main(String[] args) {
        int n = 10; /* top 10 items */
        int[] items = new int[n];
        fib(items); /* init Fibonacci */

        int[] fibonacci = new int[]{1, 1, 2, 3, 5, 8, 13, 21, 34, 55};

        for (int i = 0; i < items.length; i++) {
            assert items[i] == fibonacci[i];
        }
    }

    /**
     * Init Fibonacci items
     *
     * @param items the items
     */
    public static void fib(int[] items) {
        items[0] = 1;
        items[1] = 1;
        for (int i = 2; i < items.length; i++) {
            items[i] = items[i - 1] + items[i - 2];
        }
    }
}
