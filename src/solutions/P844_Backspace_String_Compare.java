package solutions;

public class P844_Backspace_String_Compare {
    class Solution {
        public boolean backspaceCompare(String s, String t) {
            return backspaced(s).equals(backspaced(t));
        }

        public String backspaced(String s) {
            char[] ch = new char[s.length()];
            int j = 0;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c != '#') {
                    ch[j++] = c;
                } else if (j > 0) j--;
            }

            return String.valueOf(ch).substring(0, j);
        }
    }

}
