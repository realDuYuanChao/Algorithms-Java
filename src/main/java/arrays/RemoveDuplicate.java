package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeDuplicate(new Integer[]{1, 1, 2, 2, 3, 4, 4}))); /* [1, 2, 3, 4] */
        System.out.println(Arrays.toString(removeDuplicate(new Character[]{'a', 'a', 'b', 'b', 'c'}))); /* [a, b, c] */
    }

    /**
     * Remove duplicate element
     *
     * @param origin the duplicate element
     * @return the array after removing duplicate element
     */
    public static Object[] removeDuplicate(Object[] origin) {
        Set<Object> set = new HashSet<>(Arrays.asList(origin));
        return set.toArray();
    }
}
