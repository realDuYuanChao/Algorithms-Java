package maths;

import java.util.*;

public class Factors {
    public static void main(String[] args) {
        assert getFactors(1).equals(new ArrayList<>(Collections.singletonList(1)));
        assert getFactors(2).equals(new ArrayList<>(Arrays.asList(1, 2)));
        assert getFactors(3).equals(new ArrayList<>(Arrays.asList(1, 3)));
        assert getFactors(8).equals(new ArrayList<>(Arrays.asList(1, 2, 4, 8)));
    }

    /**
     * Return all factors of number
     *
     * @param number the number
     * @return all factors of {@code number}
     */
    public static List<Integer> getFactors(int number) {
        if (number <= 0) {
            throw new ArithmeticException("number must be positive.");
        }
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= number; ++i) {
            if (number % i == 0) {
                factors.add(i);
            }
        }
        return factors;
    }
}
