package solutions;

import java.util.Arrays;

public class P0179_Largest_Number {
    class Solution {
        public String largestNumber(int[] nums) {
            String[] arr = new String[nums.length];
            int idx = 0;
            for(int ele : nums) arr[idx++] = ele + "";

            Arrays.sort(arr, (a, b)-> {
                String s1 = a + "" + b;
                String s2 = b + "" + b;
                return s2.compareTo(s1);
            });

            StringBuilder sb = new StringBuilder();
            for(String ele : arr) sb.append(ele);

            if(sb.charAt(0) == '0') return "0";

            return sb.toString();
        }
    }
}
