class Solution {
    static int dp[][];
    private static int money(int idx , int fee , int buy , int prices[],int[][]dp){
        if(idx >= prices.length) return 0;
        int maxprofit =0;
        if( dp[idx][buy]!=-1) return dp[idx][buy];
        if(buy == 1){
            int buykaro = -prices[idx] + money(idx+1,fee , 0 ,prices,dp);
            int skipkaro = 0 + money(idx+1 , fee , 1 , prices,dp);
            maxprofit = Math.max(buykaro,skipkaro) ;
        }
        else{
            int sellkaro = prices[idx]-fee + money(idx+1,fee,1,prices,dp);
            int skipkaro = 0 + money (idx+1,fee,0,prices,dp);
            maxprofit = Math.max(sellkaro,skipkaro);
        }
    return dp[idx][buy]=maxprofit;}
    public int maxProfit(int[] prices, int fee) {
        dp = new int[prices.length][2];
        for(int i =0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
        return money(0,fee,1,prices,dp);
        
    }
}