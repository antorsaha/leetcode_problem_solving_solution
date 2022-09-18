package solutions;

import java.util.HashMap;
import java.util.Map;

public class P0001_TwoSum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i], i);
            }

            for (int i = 0; i < nums.length; i++) {
                int reminder = target - nums[i];

                if (map.containsKey(reminder)) {
                    int index = map.get(reminder);
                    if (index == i) continue;
                    return new int[]{i, index};
                }
            }
            return new int[]{};
        }
    }
}
