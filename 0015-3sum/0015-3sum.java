class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> retList = new HashSet<List<Integer>>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int left = i+1;
            int right = nums.length-1;

            while(left<right) {
                int sum = nums[i] + nums[left] + nums[right];

                if(sum==0) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);

                    retList.add(temp);
                    left++;right--;
                }
                else if(sum<0) {
                    left++;
                }
                else {
                    right--;
                }
            }
            
        }
        return new ArrayList<>(retList);
    }

}