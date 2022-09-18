package solutions;

public class P0004_MedianOfTwoSortedArrays {
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int i = 0;
            int j = 0;
            int count = 0;
            int size = nums1.length + nums2.length;
            int[] mergedList = new int[size];

            while (i < nums1.length && j < nums2.length) {
                if (nums1[i] < nums2[j]) {
                    mergedList[count] = nums1[i];
                    i++;
                } else {
                    mergedList[count] = nums2[j];
                    j++;
                }
                count++;
            }
            if (i < nums1.length) {
                while (i < nums1.length) {
                    mergedList[count] = nums1[i];
                    i++;
                    count++;
                }
            }
            if (j < nums2.length) {
                while (j < nums2.length) {
                    mergedList[count] = nums2[j];
                    j++;
                    count++;
                }
            }
            if (size % 2 == 0) {
                return (mergedList[size / 2] + mergedList[(size / 2) - 1]) / 2.00;
            }
            return mergedList[(size - 1) / 2];

        }
    }
}
