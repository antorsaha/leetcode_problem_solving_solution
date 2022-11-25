package solutions;

import java.util.HashSet;
import java.util.Set;

public class P0345_Reverse_Vowels_of_a_String {
    class Solution {
        public String reverseVowels(String s) {

            if (s.length() == 1)
                return s;

            int start = 0, end = s.length() - 1;
            char[] c = s.toCharArray();

            Set<Character> set = new HashSet<>();

            set.add('A');
            set.add('E');
            set.add('I');
            set.add('O');
            set.add('U');
            set.add('a');
            set.add('e');
            set.add('i');
            set.add('o');
            set.add('u');

            while (start < end) {

                if (set.contains(c[start]) && set.contains(c[end])) {
                    char temp = c[start];
                    c[start++] = c[end];
                    c[end--] = temp;
                } else {
                    if (!set.contains(c[start]))
                        start++;
                    if (!set.contains(c[end]))
                        end--;
                }
            }

            StringBuilder newString = new StringBuilder();

            for (int i = 0; i < c.length; i++) {
                newString.append(c[i]);
            }

            return newString.toString();

        }
    }
}
