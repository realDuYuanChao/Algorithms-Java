
package maths;

/**
 * @author https://github.com/shellhub
 */

public class TowerOfHanoi {
    public static void main(String[] args) {

        int n = 5;

        char A = 'A';
        char B = 'B';
        char C = 'C';

        hanoi(n, A, B, C);
    }

    public static void hanoi(int n, char A, char B, char C) {
        if (n != 0) {
            hanoi(n - 1, A, C, B);
            System.out.format("Move %c to %c\n", A, C);
            hanoi(n - 1, B, A, C);
        }
    }
}
