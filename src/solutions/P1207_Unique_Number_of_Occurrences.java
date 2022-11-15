package solutions;

import java.util.HashMap;
import java.util.HashSet;

public class P1207_Unique_Number_of_Occurrences {
    class Solution {
        public boolean uniqueOccurrences(int[] arr) {
            HashMap<Integer, Integer> map = new HashMap<>();
            HashSet<Integer> set = new HashSet<>();

            for (int value : arr) {
                if (map.containsKey(value)) {
                    map.put(value, map.get(value) + 1);
                } else
                    map.put(value, 1);
            }

            for (int value : map.values()) {
                if (set.contains(value))
                    return false;
                set.add(value);
            }
            return true;
        }
    }
}
