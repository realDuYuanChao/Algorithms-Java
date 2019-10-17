package maths;

/**
 * @author https://github.com/shellhub
 */

public class PalindromeString {
    public static void main(String[] args) {
        String[] items = {"a", "a1a", "123abc", "abccba"};
        for (String item : items) {
            if (isPalindrome(item)) {
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
     * @return <tt>true</tt> if {@code palindrome} is palindrome string, otherwise <tt>false</tt>.
     */
    public static boolean isPalindrome(String palindrome) {
        int length = palindrome.length();
        int i = 0, j = length - 1;

        while (i <= j) {
            if (palindrome.charAt(i++) != palindrome.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}
