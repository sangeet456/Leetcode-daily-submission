class Solution {
    static int dp[][];
    static int  money(int idx , int buy  ,int [] prices, int dp[][] ){
        if(idx >= prices.length) return 0;
       if(dp[idx][buy]!=-1) return dp[idx][buy];
        int maxprofit = 0;
        if(buy ==1){
            int buykaro = -prices[idx] + money(idx+1, 0 , prices,dp);
            int skipkaro = 0 + money(idx+1 ,1,prices,dp );
            maxprofit = Math.max(buykaro,skipkaro);
        }
        else{
            int sellkaro = prices[idx] + money(idx+2,1,prices,dp);
            int skipkaro = 0 + money ( idx +1 , 0  , prices,dp);
            maxprofit = Math.max(sellkaro,skipkaro);
        }
  return dp[idx][buy] = maxprofit ; 
   }
    public int maxProfit(int[] prices) {
        int n = prices.length;
        dp = new int[n][n+1];
        for(int i =0;i<dp.length;i++){
            for(int j =0 ;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
            return money(0,1,prices ,dp);
        
    }
}