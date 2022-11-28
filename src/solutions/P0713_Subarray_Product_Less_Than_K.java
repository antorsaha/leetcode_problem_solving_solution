package solutions;

public class P0713_Subarray_Product_Less_Than_K {
    class Solution {
        public int numSubarrayProductLessThanK(int[] nums, int k) {
            if(k<2)return 0;
            int left=0,right=0,prod=1,res=0;
            for(;right<nums.length;right++){
                prod*=nums[right];
                while(prod>=k)prod/=nums[left++];
                res+=right-left+1;
            }
            return res;
        }
    }
}
