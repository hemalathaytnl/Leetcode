class Solution {
    public int countConsistentStrings(String allowed, String[] words) {

        Set<Character> st=new HashSet<>();
        for(char c:allowed.toCharArray())
        {
            st.add(c);
        }
        int co=0;
        for(String word:words)
        {
            boolean var=true;
            for( char i:word.toCharArray() )
            {
                if(!st.contains(i))
                {
                    var=false;
                    break;
                }
            }
            if(var)
            co++;
        }
        return co;
        
    }
}