package solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P0229_Majority_Element_II {
    class Solution {
        public List<Integer> majorityElement(int[] nums) {
            Map<Integer, Integer> countMap = new HashMap<>();
            List<Integer> resultList = new ArrayList<>();
            float countBoundary = nums.length / (float) 3;

            for (int i = 0; i < nums.length; i++) {
                countMap.put(nums[i], countMap.getOrDefault(nums[i], 0) + 1);
            }

            for (int i : countMap.keySet()) {
                if (countMap.get(i) > countBoundary) {
                    resultList.add(i);
                }
            }

            return resultList;
        }
    }
}
