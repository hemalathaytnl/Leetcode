class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> st=new HashSet<>();
        for(int i:nums1 )
        {
            st.add(i);
        }     
        Set<Integer> st1=new HashSet<>();
        for(int i:nums2 )
        {
            if(st.contains(i))
            {
            st1.add(i);
            }
        }     
        int arr[]= new int[st1.size()];
        int i=0;
        for(int num : st1)
        {
            arr[i]=num;
            i++;
        }
        return arr;
    }
}