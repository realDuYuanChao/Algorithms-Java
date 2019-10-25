package DataStructures;

import java.util.Stack;

public class BracketsMatch {
    public static void main(String[] args) {
        assert isBalanced("[()]{}{[()()]()}");
        assert !isBalanced("[(])");
    }

    /**
     * Check if {@code leftBracket} and {@code rightBracket} is paired or not
     *
     * @param leftBracket   left bracket
     * @param rightBracket right bracket
     * @return <tt>true</tt> if {@code leftBracket} and {@code rightBracket} is paired,
     * otherwise <tt>false</tt>
     */
    public static boolean isPaired(char leftBracket, char rightBracket) {
        char[][] pairedBrackets = {
                {'(', ')'},
                {'[', ']'},
                {'{', '}'}
        };
        for (char[] pairedBracket : pairedBrackets) {
            if (pairedBracket[0] == leftBracket && pairedBracket[1] == rightBracket) {
                return true;
            }
        }
        return false;
    }

    /**
     * Check if specified {@code brackets} is balanced
     *
     * @param brackets the brackets
     * @return <tt>true</tt> if {@code brackets} is balanced, otherwise <tt>false</tt>
     */
    public static boolean isBalanced(String brackets) {
        if (brackets == null) {
            throw new IllegalArgumentException("brackets is null");
        }
        Stack<Character> stack = new Stack<>();
        for (char bracket : brackets.toCharArray()) {
            switch (bracket) {
                case '(':
                case '[':
                case '{':
                    stack.push(bracket);
                    break;
                case ')':
                case ']':
                case '}':
                    if (!(!stack.isEmpty() && isPaired(stack.pop(), bracket))) {
                        return false;
                    }
                    break;
                default: /* other character is invalid */
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
