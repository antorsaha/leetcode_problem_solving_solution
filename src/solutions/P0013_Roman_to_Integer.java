package solutions;

import java.util.HashMap;

public class P0013_Roman_to_Integer {
    class Solution {
        public int romanToInt(String s) {
            HashMap<Character, Integer> values = new HashMap<>();
            values.put('I', 1);
            values.put('V', 5);
            values.put('X', 10);
            values.put('L', 50);
            values.put('C', 100);
            values.put('D', 500);
            values.put('M', 1000);
            int ans = 0;

            int i = 0;
            for (; i< s.length() - 1; i++){
                switch (s.charAt(i)){
                    case 'I':
                        if (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X'){
                            ans += (values.get(s.charAt(i + 1)) - values.get(s.charAt(i)));
                            i++;
                        }else
                            ans += values.get(s.charAt(i));
                        break;
                    case 'X':
                        if (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C'){
                            ans += (values.get(s.charAt(i + 1)) - values.get(s.charAt(i)));
                            i++;
                        }else
                            ans += values.get(s.charAt(i));
                        break;
                    case 'C':
                        if (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M'){
                            ans += (values.get(s.charAt(i + 1)) - values.get(s.charAt(i)));
                            i++;
                        }else
                            ans += values.get(s.charAt(i));
                        break;
                    default:
                        ans += values.get(s.charAt(i));

                }
            }
            if (i != s.length()){
                ans += values.get(s.charAt(s.length() - 1));
            }
            return ans;
        }
    }
}
