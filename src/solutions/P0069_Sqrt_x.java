package solutions;

public class P0069_Sqrt_x {
    class Solution {
        public int mySqrt(int x) {
        /* Brute force approach : Let us consider x as 16, now to find the square root we will take 16 nos. in the array [1,2,3,4,5,6,7,8,9, ... 16] and will check
        if  1*1 == 16
            2*2 == 16
            3*3 == 16
            4*4 == 16 -> found our answer  */

            int len = x;

            //Applying binary search in the array we formed

            int start = 0;
            int end = len;

            while(start <= end)
            {
                long mid = start + (end-start)/2;   //long datatype, as the range of x is very high

                if(x < mid * mid)
                {
                    end = (int)mid - 1;
                }
                else if(x > mid * mid)
                {
                    start = (int)mid + 1;
                }
                else
                {
                    return (int)mid;
                }
            }

            //Now in the array we have to find the square root of the non-perfect squares
    /* Consider an example,
        x = 7 so, len = 7

       start = 0, end = 7
       mid = 3 --->  7 < 9 -----> end = mid - 1 ----> end = 3 - 1 = 2

       start = 0, end = 2
       mid = 1 ----> 7 > 1 -----> start = mid + 1 -----> start = 1 + 1 = 2

       start = 2, end = 2
       mid = 2 -----> 7 > 4 -------> start = mid + 1 -----> start = 2 + 1 = 3

       start > end terminated
       END ----> answer, if the number is non-perfect square */

            return end;
        }

    }
}
