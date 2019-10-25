package string;

public class PatternSearching {
    public static void main(String[] args) {
        assert indexOf("123abc", "23") == 1;
        assert indexOf("123abc", "abc") == 3;
        assert indexOf("123abc", "123") == 0;
        assert indexOf("123abc", "abcd") == -1;
    }

    /**
     * Returns the index within this string of the first occurrence of the
     * specified substring.
     *
     * @param str the bigger string
     * @param sub the substring to search for.
     * @return the index of the first occurrence of the specified substring,
     * or {@code -1} if there is no such occurrence.
     */
    public static int indexOf(String str, String sub) {
        int i = 0;
        int j = 0;
        while (i < str.length() && j < sub.length()) {
            if (str.charAt(i) == sub.charAt(j)) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        return j == sub.length() ? i - j : -1;
    }
}
