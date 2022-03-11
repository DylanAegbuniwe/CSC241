/**
 *
 * @author dylan
 */
import java.util.*;
public class ValidParentheses {
    public boolean isValidParentheses(String s) {
        if (s.isEmpty()) {
            return true;
        }

        char[] carr = s.toCharArray();

        if (carr.length % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < carr.length; ++i) {
            char curr = carr[i];

            if (curr == '(' || curr == '[' || curr == '{') {
                stack.push(curr);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.peek();

                if (!(top == '(' && curr == ')' ||
                      top == '[' && curr == ']' ||
                      top == '{' && curr == '}')) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }

        if (stack.size() > 0) {
            return false;
        }

        return true;
    }
}

