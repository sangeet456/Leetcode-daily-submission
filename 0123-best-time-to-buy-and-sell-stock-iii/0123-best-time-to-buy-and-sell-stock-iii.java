class Solution {
    static int dp[][][];
    static int money( int idx , int buy , int limit , int [] prices, int dp [][][]){
        if(idx == prices.length) return 0;
        if(limit == 0) return 0;
        if(dp[idx][buy][limit] != -1) return dp[idx][buy][limit];
        int maxprofit = 0;
        if(buy == 1){
            int buykaro = -prices[idx] + money(idx+1,0,limit,prices,dp);
            int skipkaro = 0 + money(idx+1 , 1 , limit  , prices,dp);
            maxprofit = Math.max(buykaro,skipkaro);
        }
        else {
            int sellkaro = prices[idx] + money(idx+1,1,limit-1,prices,dp);
            int skipkaro = 0 + money(idx+1,0,limit,prices,dp);
     maxprofit = Math.max(sellkaro,skipkaro);
        }
        return dp[idx][buy][limit] = maxprofit;
   }
    public int maxProfit(int[] prices) {
        int n = prices.length;
        dp = new int[n][2][3];
        for(int i =0 ;i<dp.length;i++){
            for(int j = 0 ;j<dp[0].length;j++){
                Arrays.fill(dp[i][j],-1);
            }

        }
        return money(0,1,2,prices,dp);
        
    }
}