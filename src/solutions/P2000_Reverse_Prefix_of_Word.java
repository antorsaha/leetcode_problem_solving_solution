package solutions;

public class P2000_Reverse_Prefix_of_Word {
    class Solution {
        public String reversePrefix(String word, char ch) {
            int index = word.indexOf(ch);

            if (index != -1){
                String reverseString = new StringBuilder(word.substring(0, index + 1)).reverse().toString();
                String nextString = word.substring(index + 1);

                return reverseString + nextString;
            }

            return word;

        }
    }
}
