package solutions;

public class P0557_Reverse_Words_in_a_String_III {
    class Solution {
        public String reverseWords(String s) {

            int i = 0, j = 0;
            char[] ch = s.toCharArray();

            while (i <= ch.length && j <= ch.length) {
                if (j == ch.length || ch[j] == ' ') {
                    reverse(ch, i, j);
                    i = j + 1;
                }
                j++;
            }
            return String.valueOf(ch);

        }

        public void reverse(char[] ch, int i, int j) {
            j = j - 1;          //because j is the position of space
            while (i < j) {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
        }
    }

}
