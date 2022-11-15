package solutions;

import java.util.ArrayList;
import java.util.List;

public class P0442_Find_All_Duplicates_in_an_Array {
    class Solution {
        public List<Integer> findDuplicates(int[] nums) {
            int i = 0;
            List<Integer> L = new ArrayList<Integer>();
            while (i < nums.length) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    int temp = nums[i];
                    nums[i] = nums[correct];
                    nums[correct] = temp;
                } else {
                    i++;
                }
            }
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] != j + 1) {
                    L.add(nums[j]);
                }
            }
            return L;
        }
    }
}
