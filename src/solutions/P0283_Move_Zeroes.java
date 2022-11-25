package solutions;

public class P0283_Move_Zeroes {
    class Solution {
        public void moveZeroes(int[] nums) {
            int n=nums.length;
            int m=0;
            for(int i=0;i<n;i++){
                if(nums[i]==0){
                    m++;
                } else if(m!=0){
                    nums[i-m]=nums[i];
                    nums[i]=0;
                }
            }

        }
    }
}
