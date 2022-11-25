package solutions;

public class P0344_Reverse_String {
    class Solution {
        public void reverseString(char[] s) {
            int first = 0;
            int last = s.length - 1;

            while(first < last){
                swap(s, first, last);
                first++;
                last--;
            }
        }

        private void swap(char[] s, int c1, int c2){
            char temp = s[c1];
            s[c1] = s[c2];
            s[c2] = temp;

        }
    }
}
