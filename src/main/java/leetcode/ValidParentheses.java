package leetcode;

import DataStructures.BracketsMatch;

/**
 * link: https://leetcode.com/problems/valid-parentheses/
 * Given a string containing just the characters
 * '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * <p>
 * Note that an empty string is also considered valid.
 * <p>
 * Example 1:
 * <p>
 * Input: "()"
 * Output: true
 * Example 2:
 * <p>
 * Input: "()[]{}"
 * Output: true
 * Example 3:
 * <p>
 * Input: "(]"
 * Output: false
 * Example 4:
 * <p>
 * Input: "([)]"
 * Output: false
 * Example 5:
 * <p>
 * Input: "{[]}"
 * Output: true
 */
public class ValidParentheses {
    public static void main(String[] args) {
        assert BracketsMatch.isBalanced("()");
        assert BracketsMatch.isBalanced("()[]{}");
        assert !BracketsMatch.isBalanced("(]");
        assert !BracketsMatch.isBalanced("([)]");
        assert BracketsMatch.isBalanced("{[]}");
    }
}
