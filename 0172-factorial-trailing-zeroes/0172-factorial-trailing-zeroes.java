class Solution {
    public int trailingZeroes(int n) {

      int  pow=5,res=0;
        while(n>=pow)
        {
            res=res+(n/pow);
            pow=pow*5;
        }
        return res;
           

    }
}