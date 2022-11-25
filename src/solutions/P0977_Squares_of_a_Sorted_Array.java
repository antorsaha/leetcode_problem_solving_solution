package solutions;

public class P0977_Squares_of_a_Sorted_Array {
    class Solution {
        public int[] sortedSquares(int[] nums) {
            int n = nums.length;
            int left = 0;
            int right = n - 1;
            int[] res = new int[n];

            for(int i = n - 1; i >= 0; i--){
                int leftNum = nums[left];
                int rightNum = nums[right];

                if(Math.abs(leftNum) > Math.abs(rightNum)){
                    res[i] = leftNum * leftNum;
                    left++;
                }
                else{
                    res[i] = rightNum * rightNum;
                    right--;
                }
            }
            return res;
        }
    }
}
