package solutions;

import java.util.HashSet;

public class P0003_LongestSubstringWithoutRepeatingCharacters {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            HashSet<Character> hashSet = new HashSet<>();
            int maxSubStringSize = 0;
            int startingPoint = 0;
            int i = 0;

            while (i < s.length()) {
                if (hashSet.contains(s.charAt(i))) {
                    hashSet.remove(s.charAt(startingPoint));
                    startingPoint++;
                } else {
                    hashSet.add(s.charAt(i));
                    i++;
                }
                maxSubStringSize = Math.max(maxSubStringSize, hashSet.size());
            }

            return maxSubStringSize;
        }
    }
}
