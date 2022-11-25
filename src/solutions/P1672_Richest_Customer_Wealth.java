package solutions;

public class P1672_Richest_Customer_Wealth {
    class Solution {
        public int maximumWealth(int[][] accounts) {
            int maxSum = 0;

            for(int i = 0; i< accounts.length; i++){
                int currentSum = 0;
                for(int j = 0; j< accounts[i].length; j++){
                    currentSum += accounts[i][j];
                }
                maxSum = Math.max(currentSum, maxSum);
            }
            return maxSum;
        }
    }
}
