import java.util.ArrayList;
public class Solution {
    public int maxArea(int[] height) {
        int lo = 0;
        int hi = height.length - 1;
        int max_area = 0;
        while (lo<hi) {
            int base=hi-lo;
            int alt=Math.min(height[lo],height[hi]);
            int area=base*alt;
            if (area > max_area)
                    max_area = area;
            else{
                if(height[lo+1]>alt)lo++;
                else if(height[hi-1]>alt)hi--;
                else break;
            }

        }

        return max_area;
    }
}