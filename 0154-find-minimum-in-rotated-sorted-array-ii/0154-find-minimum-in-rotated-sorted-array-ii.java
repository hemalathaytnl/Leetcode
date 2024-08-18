import java.util.Arrays;
class Solution {
    public int findMin(int[] nums) {
       int a=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
           a=nums[i];
           break;
        }
      return a;

    }
}