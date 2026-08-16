class Solution {

    static int dp[][][];

    static int calculate(int idx, int nums[], int buy, int limit, int dp[][][]) {
        if (idx >= nums.length)
            return 0;
        if (limit == 0)
            return 0;
        if (dp[idx][buy][limit] != -1)
            return dp[idx][buy][limit];
        int maxprofit = 0;

        if (buy == 1) {
            //buying condition 
            int buykaro = -nums[idx] + calculate(idx + 1, nums, 0, limit, dp);
            int skipkaro = 0 + calculate(idx + 1, nums, 1, limit, dp);
            maxprofit = Math.max(buykaro, skipkaro);
        }
        //selling condition//
        else {
            int sellkaro = nums[idx] + calculate(idx + 1, nums, 1, limit - 1, dp);
            int skipkaro = 0 + calculate(idx + 1, nums, 0, limit, dp);
            maxprofit = Math.max(sellkaro, skipkaro);
        }

        return dp[idx][buy][limit] = maxprofit;
    }

    public int maxProfit(int[] prices) {
        if (prices.length < 2)
            return 0;

        int n = prices.length;
        dp = new int[n][2][3];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }

        return calculate(0, prices, 1, 2, dp);
    }
}