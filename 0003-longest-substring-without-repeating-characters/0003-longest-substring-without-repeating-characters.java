class Solution {
    public int lengthOfLongestSubstring(String s) {
      int maxlength=0;
      for(int i=0;i<s.length();i++)
      {
          StringBuilder currentstring=new StringBuilder();
          for(int j =i;j<s.length();j++)
          {
           if(currentstring.indexOf(String.valueOf(s.charAt(j)))!= -1)
               {
                  break;
            }
                      currentstring.append(s.charAt(j));
          maxlength =Math.max(maxlength,currentstring.length());  

          }
      }
      return maxlength;
    }
}