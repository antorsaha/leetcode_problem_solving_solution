package solutions;

public class P0326_Power_of_Three {
    /** Problem
     * Given an integer n, return true if it is a power of three. Otherwise, return false.
     * An integer n is a power of three, if there exists an integer x such that n == 3x.
     */
    class Solution {
        public boolean isPowerOfThree(int n) {
            return (Math.log10(n) / Math.log10(3)) % 1 == 0;
        }
    }
}
