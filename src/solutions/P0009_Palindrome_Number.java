package solutions;

public class P0009_Palindrome_Number {
    class Solution {
        public boolean isPalindrome(int x) {
            int reverse = 0;
            int temp = x;
            if(x < 0)
                return false;
            while(temp != 0){
                int reminder = temp % 10;
                temp /= 10;
                reverse = reverse * 10 + reminder;
            }
            return x == reverse;
        }
    }
}
