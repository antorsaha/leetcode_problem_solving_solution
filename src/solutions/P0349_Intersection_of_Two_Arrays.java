package solutions;

import java.util.ArrayList;
import java.util.HashSet;

public class P0349_Intersection_of_Two_Arrays {
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            HashSet<Integer> set1 = new HashSet<>();
            HashSet<Integer> set2 = new HashSet<>();
            ArrayList<Integer> arrayList = new ArrayList<>();

            for (int value : nums1) {
                set1.add(value);
            }
            for (int value : nums2) {
                set2.add(value);
            }
            for (int val : set1) {
                if (set2.contains(val)) {
                    arrayList.add(val);
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
