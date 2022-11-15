package solutions;

public class P0342_Power_of_Four {
    /**
     * Given an integer n, return true if it is a power of four. Otherwise, return false.
     * An integer n is a power of four, if there exists an integer x such that n == 4x
     */

    class Solution {
        public boolean isPowerOfFour(int n) {
            return (Math.log10(n) / Math.log10(4)) % 1 == 0;
        }
    }
}
