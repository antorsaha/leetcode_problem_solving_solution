package solutions;

import java.util.HashMap;
import java.util.Map;

public class P1512_Number_of_Good_Pairs {
    class Solution {
        public int numIdenticalPairs(int[] nums) {
            Map<Integer, Integer> numberMap = new HashMap<>();
            int pCount = 0;

            for (int i = 0; i < nums.length; i++) {
                if (numberMap.containsKey(nums[i])) {
                    int feq = numberMap.get(nums[i]);
                    pCount += feq;

                    numberMap.put(nums[i], feq + 1);
                } else {
                    numberMap.put(nums[i], 1);
                }
            }
            return pCount;
        }
    }
}
