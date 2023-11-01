package solutions;

public class P2433_Find_The_Original_Array_of_Prefix_Xor {

    class Solution {
        public int[] findArray(int[] pref) {
            int[] resultArray = new int[pref.length];

            resultArray[0] = pref[0];
            for(int i = 1; i< pref.length; i++){
                resultArray[i] = pref[i - 1] ^ pref[i];

            }

            return resultArray;
        }
    }
}
