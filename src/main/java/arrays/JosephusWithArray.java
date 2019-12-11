package arrays;

import java.util.Arrays;

/**
 * @author shellhub
 * link: https://en.wikipedia.org/wiki/Josephus_problem
 * The problem — given the number of people, starting point, direction,
 * and number to be skipped — is to choose the position in the initial circle to avoid execution.
 */
public class JosephusWithArray {
    public static void main(String[] args) {

        /* the number of people */
        int[] people = new int[10];
        Arrays.fill(people, 1);
        int m = 5;

        /* input: 1 2 3 4 5 6 7 8 9 10
        output: 5 10 6 2 9 8 1 4 7 */
        assert josephus(people, m) == 3;
    }

    /**
     * Return sum of nums
     *
     * @param nums the numbers
     * @return sum of {@code nums}
     */
    public static int sum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    /**
     * Josephus problem implements using array
     *
     * @param people People are standing in a circle waiting to be executed
     * @param m      Counting begins at a specified point in the circle and proceeds around the circle in a specified direction
     * @return the position
     */
    public static int josephus(int[] people, int m) {
        int count = 0;
        for (int i = 0; sum(people) != 1; i = ++i % people.length) {
            if (people[i] == 0) {
                continue;
            }
            if (++count == m) {
                people[i] = 0;
                System.out.print(i + 1);
                count = 0;
            }
        }
        for (int i = 0; i < people.length; ++i) {
            if (people[i] == 1) {
                return i + 1;
            }
        }
        return -1;
    }
}
