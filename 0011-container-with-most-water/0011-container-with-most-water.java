import java.util.Arrays;

class Solution {
    public int maxArea(int[] height) {
        int water=0;
        int l=0;
        int r=height.length-1;
        while(l<r){
            int minarea=Math.min(height[l],height[r]);
            int area=minarea*(r-l);
            water=Math.max(water,area);
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }
        return water;
    }
}
