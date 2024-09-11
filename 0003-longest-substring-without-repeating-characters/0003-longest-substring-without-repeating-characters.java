import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
       
        int maxlength=0;
        int l=0;
        HashSet<Character> st=new HashSet<>();
        for(int r=0;r<s.length();r++){
            char curr=s.charAt(r);
            while(st.contains(curr)){
                st.remove(s.charAt(l));
                l++;
            }
            st.add(curr);
            maxlength=Math.max(maxlength,r-l+1);

        }
        return maxlength;

    }
}
