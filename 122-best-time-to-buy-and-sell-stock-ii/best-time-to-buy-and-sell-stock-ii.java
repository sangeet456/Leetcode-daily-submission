class Solution {
//using memoization//
private static int dp[][];


    static int calculate(int idx , int arr[] , int buy , int dp[][]){
        if(idx>=arr.length) return 0;
        if(dp[idx][buy] != -1) return dp[idx][buy];
        int maxprofit =0;
        if(buy == 1){
            //buying condition
            int buykaro = -arr[idx] + calculate(idx+1,arr,0,dp);
            int skipkaro = 0 + calculate(idx+1,arr,1,dp);
            maxprofit=Math.max(buykaro,skipkaro);
        }
        else{
            //selling condition
            int sellkaro = arr[idx] + calculate(idx+1,arr,1,dp);
            int skipkaro = 0 + calculate(idx+1,arr,0,dp);
            maxprofit= Math.max(sellkaro,skipkaro);
        }
  return dp[idx][buy] = maxprofit;  }


    public int maxProfit(int[] prices) {
            int n = prices.length;
           dp = new int[n][2];
            for(int i=0;i<dp.length;i++){
                for(int j=0;j<dp[0].length;j++){
                    dp[i][j] = -1;
                }
            }

        
        return calculate(0,prices,1,dp);
    }
}