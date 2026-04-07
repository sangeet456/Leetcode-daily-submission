class Solution {
    static int dp[][][];
private static int money (int idx , int k , int buy , int[] prices,int dp[][][]){
    
    if(idx == prices.length) return 0;
    if(k==0) return 0;
    if(dp[idx][k][buy] != -1) return dp[idx][k][buy];
    int maxprofit =0 ;
    if(buy ==1 ){
        int buykaro = -prices[idx] + money(idx+1,k,0,prices,dp);
        int skipkaro = 0 + money(idx+1,k,1,prices,dp);
        maxprofit = Math.max(buykaro,skipkaro);

    }
    else {
        int sellkaro = prices[idx] + money(idx+1,k-1,1,prices,dp);
        int skipkaro = 0 + money(idx+1,k,0,prices,dp);
        maxprofit = Math.max(sellkaro,skipkaro);
    }

return  dp[idx][k][buy]= maxprofit;
}



    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
       dp = new int[n][k+1][2];
        for(int i =0;i<n;i++){
            for(int j =0 ; j<dp[0].length;j++){
                Arrays.fill(dp[i][j], -1);
            }
        }
        return money(0,k,1,prices,dp);
    }
}