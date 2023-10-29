package solutions;

public class P1456_Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length {

    class Solution {
        public int maxVowels(String s, int k) {
            int[] maxCount = {0};

            helper(s, k, 0, 0, maxCount);

            return maxCount[0];
        }

        public void helper(String s, int k, int ind, int count, int[] maxCount) {
            if (k == 0) {
                maxCount[0] = Math.max(maxCount[0], count);
                return;
            }

            if (ind == s.length()) {
                return;
            }

            char ch = s.charAt(ind);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }

            if (ind >= k - 1) {
                maxCount[0] = Math.max(maxCount[0], count);
                if (s.charAt(ind - k + 1) == 'a' || s.charAt(ind - k + 1) == 'e' || s.charAt(ind - k + 1) == 'i' || s.charAt(ind - k + 1) == 'o' || s.charAt(ind - k + 1) == 'u') {
                    count--;
                }
            }

            helper(s, k, ind + 1, count, maxCount);
        }
    }
}
