package maths;

/**
 * @author https://github.com/shellhub
 */

public class PalindromeNumber {
    public static void main(String[] args) {

        int[] numbers = {12321 /* true */, 1234 /* false */, 1 /* true */};
        for (int number : numbers) {
            if (isPalindrome(number)) {
                System.out.println(number + " is palindrome number.");
            } else {
                System.out.println(number + " is not palindrome number.");
            }
        }
    }

    /**
     * Check out whether {@code n} is palindrome number or not
     *
     * @param number the number
     * @return <tt>true</tt> if {@code n} is palindrome number, otherwise <tt>false</tt>
     */
    public static boolean isPalindrome(int number) {
        if (number < 0) {
            throw new IllegalArgumentException(number + "");
        }
        int numberCopy = number;
        int reverseNumber = 0;
        while (numberCopy != 0) {
            int remainder = numberCopy % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            numberCopy /= 10;
        }
        return number == reverseNumber;
    }
}
