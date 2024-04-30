package solutions;

public class P0169_Majority_Element {

    class Solution {
        public int majorityElement(int[] nums) {
            int answerIndex = 0;
            int count = 1;

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == nums[answerIndex]) {
                    count++;
                } else {
                    count--;
                }

                if (count == 0) {
                    count = 1;
                    answerIndex = i;
                }
            }

            return nums[answerIndex];
        }
    }
}
