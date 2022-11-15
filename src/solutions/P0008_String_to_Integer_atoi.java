package solutions;

public class P0008_String_to_Integer_atoi {
    class Solution {
        public int myAtoi(String s) {

            String str = s.replaceAll("^\\s+", "");
            StringBuilder sb = new StringBuilder();
            int resultInt = 0;

            for (int i = 0; i < str.length(); i++) {

                if (i == 0 && (str.charAt(0) == '+' || str.charAt(0) == '-')) {
                    sb.append(str.charAt(0));
                } else {
                    int asciiValue = (int) str.charAt(i);    //Assinging charaters ascii value
                    if (asciiValue <= 57 && asciiValue >= 48) {             //Filtering digits
                        sb.append(str.charAt(i));
                    } else {
                        break;
                    }
                }
            }
            if (sb.length() > 0) {
                if (sb.length() == 1 && (sb.charAt(0) == '+' || sb.charAt(0) == '-'))
                    resultInt = 0;
                else {
                    try {
                        resultInt = Integer.parseInt(sb.toString());
                    } catch (NumberFormatException e) {
                        if (sb.charAt(0) == '-')
                            resultInt = Integer.MIN_VALUE;
                        else
                            resultInt = Integer.MAX_VALUE;
                    }
                }
            }
            return resultInt;
        }
    }
}
