class Solution {
    static int[][] dp;

static int moneyloot(int idx  , int [] arr ,int []dp){
if(idx>=arr.length) return 0;
if(dp[idx]!=-1) return dp[idx];

int take = arr[idx]+ moneyloot(idx+2, arr,dp);
int skip = moneyloot(idx+1, arr,dp);

return dp[idx]=Math.max(take,skip);


}

    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
return moneyloot(0, nums,dp);
        
    }
}