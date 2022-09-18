package solutions;

public class P0011_Container_With_Most_Water {
    class Solution {
        public int maxArea(int[] height) {
            int i=0;
            int j = height.length-1;
            int ans =0;

            while(i < j ){
                int breadth = j-i;
                int length = Math.min(height[j],height[i]);

                ans = Math.max(ans,breadth*length);

                if(height[i]<=height[j]){
                    i++;
                }else{
                    j--;
                }
            }
            return ans;
        }
    }
}
