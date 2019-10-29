package string;

public class CountCharacter {
    public static void main(String[] args) {
        assert countCharacter("") == 0;
        assert countCharacter("1 2 3 4") == 4;
        assert countCharacter("hello world") == 10;
    }

    /**
     * Count number of non space character in specified str
     *
     * @param str the string
     * @return number of non space character in specified string
     */
    public static int countCharacter(String str) {
        if (str == null) {
            throw new NullPointerException("str == null");
        }
        return str.replaceAll("\\s", "").length();
    }
}
