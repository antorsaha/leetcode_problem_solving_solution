package solutions;

import java.util.ArrayList;
import java.util.HashMap;

public class P0350_Intersection_of_Two_Arrays_II {
    class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            HashMap<Integer, Integer> map1 = new HashMap<>();
            HashMap<Integer, Integer> map2 = new HashMap<>();
            ArrayList<Integer> arrayList = new ArrayList<>();

            for (int value : nums1) {
                if (map1.containsKey(value)) {
                    map1.put(value, map1.get(value) + 1);
                } else
                    map1.put(value, 1);
            }
            for (int value : nums2) {
                if (map2.containsKey(value)) {
                    map2.put(value, map2.get(value) + 1);
                } else
                    map2.put(value, 1);
            }
            for (int val : map1.keySet()) {
                if (map2.containsKey(val)) {
                    int n = Math.min(map1.get(val), map2.get(val));
                    for (int i = 0; i < n; i++) {
                        arrayList.add(val);
                    }
                }
            }
            int[] ans = new int[arrayList.size()];
            int index = 0;
            for (int val : arrayList) {
                ans[index++] = val;
            }
            return ans;
        }
    }
}
