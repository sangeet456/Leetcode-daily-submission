class Solution {
static int dp[];

static int moneyloot(int[] arr , int idx,int dp[] ){

if(idx>=arr.length) return 0;
if(dp[idx]!=-1) return dp[idx];
int take = arr[idx] + moneyloot(arr,idx+2,dp);
int skip = moneyloot(arr,idx+1,dp);
return dp[idx] = Math.max(take,skip);
}


    public int rob(int[] nums) {
        int n = nums.length;
        dp = new int[n+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp,-1);
        }

return moneyloot(nums,0,dp);
        
    }
}