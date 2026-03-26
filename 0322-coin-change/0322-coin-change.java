class Solution {
    
static long count(int idx , int []coins , int amount,long [][] dp){
    if(idx==coins.length){
        if(amount ==0) return 0;
        else
       return Integer.MAX_VALUE;
    }
    if(dp[idx][amount] != -1) return dp[idx][amount];
    long skip = count(idx+1,coins,amount,dp);
    if(amount-coins[idx]<0) return skip;
    long take = 1+count(idx ,coins , amount - coins[idx],dp );

return dp[idx][amount]=Math.min(skip,take);
}

    public int coinChange(int[] coins, int amount) {
        long [][] dp = new long[coins.length][amount+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]= -1;
            }
        } 
       
       int ans = (int)count(0,coins,amount,dp); 
       if(ans == Integer.MAX_VALUE) return -1 ;
       else 
       return ans;
    }
}