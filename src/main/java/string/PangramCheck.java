package string;

/**
 * Link: https://en.wikipedia.org/wiki/Pangram
 */
public class PangramCheck {
    public static void main(String[] args) {
        assert isPangram("The quick brown fox jumps over the lazy dog");
    }

    /**
     * Check if a string is pangram sentence or not
     *
     * @param sentence to be checked
     * @return <tt>true</tt> if {@code sentence} is pangram, otherwise <tt>false</tt>
     */
    public static boolean isPangram(String sentence) {
        boolean[] marked = new boolean[26];
        for (int i = 0, length = sentence.length(); i < length; ++i) {
            char letter = sentence.charAt(i);
            if (Character.isUpperCase(letter)) {
                marked[letter - 'A'] = true;
            } else if (Character.isLowerCase(letter)) {
                marked[letter - 'a'] = true;
            }
        }
        for (int i = 0; i < marked.length; ++i) {
            if (!marked[i]) {
                return false;
            }
        }
        return true;
    }
}
