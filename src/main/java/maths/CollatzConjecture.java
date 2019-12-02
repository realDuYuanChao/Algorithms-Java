package maths;

/**
 * link: https://en.wikipedia.org/wiki/Collatz_conjecture
 */
public class CollatzConjecture {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; ++i) {
            assert collatzConjecture(i);
        }
    }

    /**
     * Collatz conjecture algorithm
     *
     * @param number the number to guess
     * @return <tt>true</tt> if Collatz conjecture is truth
     */
    public static boolean collatzConjecture(int number) {
        do {
            number = number % 2 == 0 ? number / 2 : 3 * number + 1;
        } while (number != 1);
        return true;
    }
}
