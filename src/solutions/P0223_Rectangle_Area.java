package solutions;

public class P0223_Rectangle_Area {
    class Solution {
        public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
            int xDistanceA = Math.abs(ax1 - ax2);
            int yDistanceA = Math.abs(ay1 - ay2);

            int xDistanceB = Math.abs(bx1 - bx2);
            int yDistanceB = Math.abs(by1 - by2);
            int totalCoveredArea = (xDistanceA * yDistanceA) + (xDistanceB * yDistanceB);

            int intersectedX = Math.min(ax2, bx2) - Math.max(ax1, bx1);
            int intersectedY = Math.min(ay2, by2) - Math.max(ay1, by1);
            int overlappedArea = 0;

            if (intersectedX > 0 && intersectedY > 0)
                overlappedArea = (intersectedX * intersectedY);

            return totalCoveredArea - overlappedArea;
        }
    }
}
