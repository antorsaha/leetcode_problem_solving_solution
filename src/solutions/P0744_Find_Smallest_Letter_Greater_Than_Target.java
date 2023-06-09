package solutions;

public class P0744_Find_Smallest_Letter_Greater_Than_Target {

    class Solution {
        public char nextGreatestLetter(char[] arr, char target) {
            int low = 0 ;
            int high = arr.length - 1;
            while(low <= high){
                int mid = low + (high - low)/2;
                if(arr[mid] <= target)
                    low = mid + 1;
                else
                    high = mid - 1;
            }
            return arr[low % arr.length];
        }
    }
}
