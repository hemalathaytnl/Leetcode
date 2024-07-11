class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> res = new HashSet<>();
        Set<Integer> curr = new HashSet<>();
        
        for (Integer num : arr) {
            Set<Integer> temp = new HashSet<>();
            temp.add(num);

            for (Integer elem : curr) temp.add(num | elem);

            curr = temp;
            for (Integer elem : curr) res.add(elem);
        }

        return res.size();
    }
}