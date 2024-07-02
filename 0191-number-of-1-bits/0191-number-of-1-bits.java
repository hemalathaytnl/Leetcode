class Solution {
    public int hammingWeight(int n) {
        
        int co=0;
        for(int i=0;i<n;i++)
        {
            n&=n-1;
            co++;
        }
        return co;


    }
}