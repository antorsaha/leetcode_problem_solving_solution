package solutions;

import java.util.Stack;

public class P0020_ValidParentheses {
    class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < s.length(); i++) {
                switch (s.charAt(i)) {
                    case '(':
                    case '{':
                    case '[':
                        stack.add(s.charAt(i));
                        break;
                    case ')':
                    case '}':
                    case ']':
                        if (stack.isEmpty()) {
                            return false;
                        }
                        if (!isEqual(stack.peek(), s.charAt(i))) {
                            return false;
                        }


                        stack.pop();
                }
            }
            return stack.isEmpty();
        }

        public boolean isEqual(char c1, char c2) {
            return (c1 == '(' && c2 == ')') || (c1 == '{' && c2 == '}') || (c1 == '[' && c2 == ']');
        }
    }
}
