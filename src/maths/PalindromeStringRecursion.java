package maths;

/**
 * @author https://github.com/shellhub
 */

public class PalindromeStringRecursion {
    public static void main(String[] args) {
        String[] items = {"a", "a1a", "123abc", "abccba"};
        for (String item : items) {
            if (isPalindrome(item, 0, item.length() - 1)) {
                System.out.println(item + " is palindrome string");
            } else {
                System.out.println(item + " is not palindrome string");
            }
        }
    }

    /**
     * Checkout whether {@code palindrome} is palindrome string or not.
     *
     * @param palindrome to checkout
     * @param left       the index of first element
     * @param right      the index of last element
     * @return {@code true} if {@code palindrome} is palindrome string, otherwise {@code false}.
     */
    public static boolean isPalindrome(String palindrome, int left, int right) {
        if (left >= right) {
            return true;
        } else if (palindrome.charAt(left) != palindrome.charAt(right)) {
            return false;
        } else {
            isPalindrome(palindrome, left + 1, right - 1);
        }
        return true;
    }
}
