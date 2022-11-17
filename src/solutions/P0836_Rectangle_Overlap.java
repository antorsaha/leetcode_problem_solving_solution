package solutions;

public class P0836_Rectangle_Overlap {
    class Solution {
        public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
            boolean isOverlapped = false;
            int intersectX = Math.min(rec1[2], rec2[2]) - Math.max(rec1[0], rec2[0]);
            int intersectY = Math.min(rec1[3], rec2[3]) - Math.max(rec1[1], rec2[1]);

            if (intersectX > 0 && intersectY > 0)
                isOverlapped = true;
            return isOverlapped;
        }
    }
}
