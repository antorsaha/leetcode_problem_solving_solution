package solutions;

public class P1980_Find_Unique_Binary_String {
    class Solution {
        public String findDifferentBinaryString(String[] nums) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i].charAt(i) == 0) {
                    stringBuilder.append(1);
                } else {
                    stringBuilder.append(0);
                }
            }
            return stringBuilder.toString();
        }
    }
}
