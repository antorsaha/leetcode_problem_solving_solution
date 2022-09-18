package solutions;

import java.util.ArrayList;
import java.util.List;

public class P0658_FindKClosestElements {
    class Solution {
        public List<Integer> findClosestElements(int[] arr, int k, int x) {
            int i = 0, j = arr.length - 1;
            while (j - i >= k) {
                if (Math.abs(arr[i] - x) > Math.abs(arr[j] - x)) i++;
                else j--;
            }
            List<Integer> ans = new ArrayList<>();
            for (int ele = i; ele <= j; ele++) ans.add(arr[ele]);
            return ans;
        }
    }
}
