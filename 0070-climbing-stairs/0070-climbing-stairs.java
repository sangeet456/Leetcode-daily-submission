class Solution {
    static int climb(int n,int dp[]){
        if(dp[n]!=-1) return dp[n];
        if(n==2||n==1) return n;

        return dp[n]=climb(n-1,dp)+climb(n-2,dp);
    }

    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        return climb(n,dp);
    }
}