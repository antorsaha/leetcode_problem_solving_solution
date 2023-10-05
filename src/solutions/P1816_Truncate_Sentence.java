package solutions;

public class P1816_Truncate_Sentence {
    class Solution {
        public String truncateSentence(String s, int k) {

            String[] splitString = s.split(" ");

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i< k; i++){
                sb.append(splitString[i]).append(" ");
            }

            return sb.toString().trim();
        }
    }
}
