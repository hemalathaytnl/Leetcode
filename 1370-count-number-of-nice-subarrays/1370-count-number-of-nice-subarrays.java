class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
       int i = 0, j = 0;
       int oddCount = 0;
       int subArrayCount = 0;
       int temp = 0;

       while(j < nums.length){
        if(nums[j] % 2 == 1){
            oddCount++;
            temp = 0;
        }

        while(oddCount == k){ 
            temp++;
            if(nums[i] % 2 == 1){
                oddCount--;
            }
            i++;
        }
        subArrayCount += temp;
        j++;
       }
       return subArrayCount;
    }
}