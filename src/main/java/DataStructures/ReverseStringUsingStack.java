package DataStructures;

import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        assert reverse("123456").equals("654321");
        assert reverse("abc").equals("cba");
        assert reverse("").equals("");
    }

    /**
     * Reverse string using stack
     *
     * @param string to be reversed
     * @return reversed string
     */
    public static String reverse(String string) {
        Stack<Character> characters = new Stack<>();
        for (int i = 0, length = string.length(); i < length; i++) {
            characters.push(string.charAt(i));
        }
        StringBuilder builder = new StringBuilder();
        while (!characters.isEmpty()) {
            builder.append(characters.pop());
        }

        return builder.toString();
    }
}
