package solutions;

import java.util.ArrayList;
import java.util.List;

public class P0131_Palindrome_Partitioning {
    class Solution {
        public List<List<String>> partition(String s) {
            List<List<String>> res = new ArrayList<>();
            if (s == null || s.length() == 0) {
                return res;
            }
            helper(s, res, new ArrayList<>(), 0);
            return res;
        }

        private void helper(String s, List<List<String>> res, List<String> temp, int index) {
            if (index == s.length()) {
                res.add(new ArrayList<>(temp));
                return;
            }
            for (int i = index; i < s.length(); i++) {
                if (isPalidrome(s, index, i)) {
                    temp.add(s.substring(index, i + 1));
                    helper(s, res, temp, i + 1);
                    temp.remove(temp.size() - 1);
                }
            }
        }

        private boolean isPalidrome(String s, int start, int end) {
            while (start < end) {
                if (s.charAt(start) != s.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }
    }
}
