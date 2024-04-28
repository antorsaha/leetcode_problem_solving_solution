package solutions;

import java.util.HashMap;

public class P0242_Valid_Anagram {
    class Solution {
        public boolean isAnagram(String s, String t) {
            HashMap<Character, Integer> sMap = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (sMap.containsKey(c)) {
                    sMap.put(c, sMap.get(c) + 1);
                } else {
                    sMap.put(c, 1);
                }
            }

            for (int i = 0; i < t.length(); i++) {
                char c = t.charAt(i);

                int count = sMap.getOrDefault(c, 0);

                if (count == 0) {
                    return false;
                } else if (count == 1) {
                    sMap.remove(c);
                } else {
                    sMap.put(c, count - 1);
                }
            }

            return sMap.keySet().size() == 0;

        }
    }
}
