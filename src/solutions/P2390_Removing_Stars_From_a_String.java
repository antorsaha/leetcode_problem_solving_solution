package solutions;

import java.util.Stack;

public class P2390_Removing_Stars_From_a_String {
    class Solution {
        public String removeStars(String s) {
            Stack<Character> stack = new Stack<>();
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '*') {
                    stack.pop();
                } else
                    stack.push(c);
            }

            StringBuilder result = new StringBuilder();
            int size = stack.size();
            for (int i = 0; i < size; i++) {
                result.append(stack.pop());

            }
            result.reverse();
            return result.toString();

        }
    }
}
