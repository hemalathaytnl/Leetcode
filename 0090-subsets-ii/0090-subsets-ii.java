import java.util.*;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> l1 = new ArrayList<>();
        Arrays.sort(nums);
        generateSubsets(nums, 0, new ArrayList<>(), l1);
                List<List<Integer>> l2 = new ArrayList<>(l1);
        
        return l2;
    }
    
    private void generateSubsets(int[] nums, int index, List<Integer> currentSubset, List<List<Integer>> result) {
        result.add(new ArrayList<>(currentSubset));
        
        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }
            
            currentSubset.add(nums[i]);
            
            generateSubsets(nums, i + 1, currentSubset, result);
            
            currentSubset.remove(currentSubset.size() - 1);
        }
    }
}
