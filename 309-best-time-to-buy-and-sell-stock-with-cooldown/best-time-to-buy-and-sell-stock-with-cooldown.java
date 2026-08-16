class Solution {

static int dp[][];

static int calculate(int arr[] , int idx , int buy , int dp[][]){
    if(idx>=arr.length) return 0;
    int maxprofit =0;
    if(dp[idx][buy]!=-1) return dp[idx][buy] ;
    if(buy ==1){
        int buykaro = -arr[idx] + calculate(arr,idx+1,0,dp);
        int skipkaro = 0 + calculate(arr,idx+1,1,dp);
    maxprofit = Math.max(buykaro,skipkaro);
    }
    else{
            int sellkaro = arr[idx] + calculate(arr,idx+2,1,dp);
            int skipkaro = 0 + calculate(arr,idx+1,0,dp);
    maxprofit = Math.max(sellkaro,skipkaro);
    }
return dp[idx][buy] = maxprofit;}

    public int maxProfit(int[] prices) {
        if(prices.length<2) return 0;
        int n = prices.length;
        dp = new int[n][2];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] =-1;
            }
        }
        
    return calculate(prices,0,1,dp);}
}