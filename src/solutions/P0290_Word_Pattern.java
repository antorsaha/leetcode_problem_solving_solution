package solutions;

import java.util.HashMap;

public class P0290_Word_Pattern {
    class Solution {
        public boolean wordPattern(String pattern, String s) {
            HashMap<Character, String> mp = new HashMap<>();
            char[] charArray = pattern.toCharArray();
            String[] words = s.split("\\s+");

            //If number of character in pattern and
            // number of words in s is not same
            // then it cannot match the pattern
            if (words.length != pattern.length())
                return false;
            int i = 0;
            for (char ch : charArray) {
                if (mp.containsKey(ch)) {
                    //if the map has the pattern char as key
                    // but the value is different form the words in that position
                    if (!mp.get(ch).equals(words[i++]))
                        return false;
                } else {
                    // the map has the ith word as value but the key is different
                    if (mp.containsValue(words[i]))
                        return false;
                    mp.put(ch, words[i++]);
                }

            }
            return true;
        }
    }
}
