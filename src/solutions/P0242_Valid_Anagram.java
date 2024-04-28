package solutions;

import java.util.HashMap;

public class P0242_Valid_Anagram {
    class Solution {
        public boolean isAnagram(String s, String t) {
            int arr[] = new int[26];

            for(char x : s.toCharArray())
                arr[x-'a']++;
            for(char x : t.toCharArray())
                arr[x-'a']--;

            for(int val: arr)
            {
                if(val!=0)
                    return false;
            }
            return true;

        }
    }
}
