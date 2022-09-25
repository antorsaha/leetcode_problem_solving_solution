package solutions;

public class P1009_Complement_of_Base_10_Integer {
    class Solution {
        public int bitwiseComplement(int n) {
            int answer = 0;
            int count = 0;

            if (n == 0) {
                return 1;
            }

            while (n != 0) {
                if ((n & 1) < 1) {
                    answer += 1 * Math.pow(2, count);
                }
                n = n >> 1;
                count++;
            }
            return answer;
        }
    }
}
