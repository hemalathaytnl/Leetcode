class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        
        while (right < nums.length) {
            sum += nums[right];
            right++;
            
            while (sum >= target) {
                minLength = Math.min(minLength, right - left);
                sum -= nums[left];
                left++;
            }
        }
        
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }
}
