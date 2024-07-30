class Solution {
    public int singleNumber(int[] nums) {

        Set<Integer> ob=new HashSet<>();
        for(int num:nums){
            if(ob.contains(num)){
                ob.remove(num);
            }
            else{
                ob.add(num);
            }
        }
        return ob.iterator().next();

    }
}