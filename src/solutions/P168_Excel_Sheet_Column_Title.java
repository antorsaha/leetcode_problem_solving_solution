package solutions;

public class P168_Excel_Sheet_Column_Title {
    class Solution {
        public String convertToTitle(int columnNumber) {
            StringBuilder st=new StringBuilder();
            while(columnNumber>0){
                columnNumber--;
                char digit=(char)('A'+(columnNumber%26));
                st.append(digit);
                columnNumber/=26;
            }
            return st.reverse().toString();
        }
    }
}
