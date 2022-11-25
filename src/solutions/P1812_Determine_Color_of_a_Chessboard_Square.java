package solutions;

public class P1812_Determine_Color_of_a_Chessboard_Square {
    class Solution {
        public static boolean squareIsWhite(String coordinates) {
            int cod1 = coordinates.charAt(0);
            int cod2 = coordinates.charAt(1);

            return (cod1 + cod2) % 2 != 0;
        }
    }
}
