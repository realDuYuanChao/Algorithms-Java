package maths;

/**
 * @author shellhub
 * reference https://en.wikipedia.org/wiki/Chinese_multiplication_table
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        multiplicationTable();
    }

    public static void multiplicationTable() {
        for (int i = 1; i <= 9; ++i) {
            for (int j = 1; j <= i; j++) {
                System.out.format("%d*%d=%d\t", j, i, j * i);
            }
            System.out.println(); /* wrap line */
        }
    }
}
