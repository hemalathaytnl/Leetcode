class Solution {
    public int countVowelStrings(int n) {

        int co=0;
        int dp[][]=new int[n][5];
        for(int i=0;i<n;i++)
        {
            dp[i][0]=1;
        }
        for(int i=0;i<5;i++)
        {
            dp[0][i]=i+1;
        }
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<5;j++)
            {
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }

        return dp[n-1][4];        
    }
}