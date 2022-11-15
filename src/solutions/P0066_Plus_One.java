package solutions;

public class P0066_Plus_One {
    class Solution {
        public int[] plusOne(int[] digits) {

            int li = digits.length - 1;
            digits[li] = (digits[li] + 1) % 10;

            while (digits[li] == 0) {
                li--;

                if (li < 0) {
                    int[] d = new int[digits.length + 1];
                    d[0] = 1;
                    return d;
                }
                digits[li] = (digits[li] + 1) % 10;
            }

            return digits;
        }
    }
}
