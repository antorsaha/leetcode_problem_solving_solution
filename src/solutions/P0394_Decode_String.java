package solutions;

import java.util.LinkedList;
import java.util.Queue;

public class P0394_Decode_String {
    class Solution {
        public String decodeString(String s) {
            Queue<Character> queue = new LinkedList<>();
            for (char c : s.toCharArray()) queue.add(c);
            return decodeString(queue);
        }

        String decodeString(Queue<Character> queue) {
            StringBuilder sb = new StringBuilder();
            int num = 0;
            while (!queue.isEmpty()) {
                char c = queue.remove();
                if (Character.isDigit(c)) {
                    num = num * 10 + c - '0';
                } else if (c == '[') {
                    String sub = decodeString(queue);
                    sb.append(repeat(sub, num));
                    num = 0;
                } else if (c == ']') {
                    break;
                } else {
                    sb.append(c);
                }
            }
            return sb.toString();
        }

        String repeat(String s, int n) {
            StringBuilder sb = new StringBuilder();
            while (n-- > 0) sb.append(s);
            return sb.toString();
        }
    }
}
