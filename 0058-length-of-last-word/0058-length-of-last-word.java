class Solution {
    public int lengthOfLastWord(String s) {
String[] a=s.split("\\s+");
int count=0;
if(a.length>0)
{
String b=a[a.length-1];
count=b.length();
}

return count;

    }
    
}