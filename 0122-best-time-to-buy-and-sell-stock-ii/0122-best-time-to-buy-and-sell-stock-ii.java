class Solution {
    static int dp [][];
    static int profit(int idx , int buy , int []prices, int [][]dp){
        if(idx == prices.length) return 0;
        if(dp[idx][buy]!=-1) return dp[idx][buy];
        int profit = 0;
        if(buy == 1){
            int buykaro = -prices[idx] + profit(idx+1 , 0 , prices,dp);
            int skipkaro = 0 + profit(idx+1, 1 , prices,dp);
            profit = Math.max(buykaro,skipkaro);
        }
        else 
        //sellkaro // condition //
        {
            int sellkaro = prices[idx] + profit(idx+1,1,prices,dp);
            int skipkaro= 0 + profit(idx+1 , 0 , prices,dp);
            profit = Math.max(sellkaro,skipkaro);
        }

   return dp[idx][buy]=profit; }

    public int maxProfit(int[] prices) {
        int n =prices.length;
    dp = new int[n][2];
    for(int i =0 ;i<dp.length;i++){
        for(int j =0 ; j<dp[0].length;j++){
            dp[i][j]=-1;
        }
    }
        return profit(0,1 , prices,dp);
    }
}