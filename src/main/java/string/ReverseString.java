package string;

public class ReverseString {
    public static void main(String[] args) {
        assert reverse("").equals("");
        assert reverse("1").equals("1");
        assert reverse("12").equals("21");
        assert reverse("123").equals("321");
    }

    /**
     * Reverse a specified string
     *
     * @param str the string
     * @return string reversed
     */
    public static String reverse(String str) {
        char[] origin = str.toCharArray();
        for (int i = 0, limit = origin.length / 2; i < limit; ++i) {
            char temp = origin[i];
            origin[i] = origin[origin.length - 1 - i];
            origin[origin.length - 1 - i] = temp;
        }
        return new String(origin);
    }
}
