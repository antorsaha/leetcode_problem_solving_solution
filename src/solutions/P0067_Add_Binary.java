package solutions;

public class P0067_Add_Binary {
    class Solution {
        public String addBinary(String a, String b) {
            StringBuilder sb = new StringBuilder();
            int indexA = a.length() - 1;
            int indexB= b.length() - 1;
            int carry = 0;

            while (indexA >= 0 || indexB >= 0){
                int sum = carry;
                if (indexA >= 0){
                    sum += a.charAt(indexA) - 48;
                    indexA--;
                }
                if (indexB >= 0){
                    sum += b.charAt(indexB) - 48;
                    indexB--;
                }
                sb.append(sum %2);
                carry = sum / 2;
            }
            if (carry != 0)
                sb.append(carry);

            return sb.reverse().toString();
        }
    }
}
