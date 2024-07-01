class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> ob=new HashMap();
        int val;
        for(int i=0;i<nums.length;i++)
        {
            val=target-nums[i];
            if(ob.containsKey(val) && ob.get(val)!=i)
            {
                return new int[]{ob.get(val),i};
            }
            ob.put(nums[i],i);

        }
        return new int[]{};
    }
}