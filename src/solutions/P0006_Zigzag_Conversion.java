package solutions;

public class P0006_Zigzag_Conversion {
    class Solution {
        public String convert(String s, int numRows) {
            if (numRows == 1)
                return s;
            StringBuilder[] dp = new StringBuilder[numRows];
            for (int i = 0; i < numRows; i++) {
                dp[i] = new StringBuilder("");
            }
            for (int i = 0, k = 0; ; ) {
                while (k < numRows && i < s.length()) {
                    dp[k].append(s.charAt(i));
                    i++;
                    k++;
                }
                k -= 2;
                while (k >= 0 && i < s.length()) {
                    dp[k].append(s.charAt(i));
                    i++;
                    k--;
                }
                k += 2;
                if (i >= s.length())
                    break;
            }
            StringBuilder ans = new StringBuilder(dp[0]);
            for (int i = 1; i < numRows; i++) {
                ans.append(dp[i]);
            }
            return ans.toString();
        }
    }
}
