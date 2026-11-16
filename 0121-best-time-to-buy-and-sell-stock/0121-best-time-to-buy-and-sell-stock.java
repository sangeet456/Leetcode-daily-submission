class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int m1 = prices[0];
        for(int i=1;i<prices.length;i++){
            int diff = prices[i]-m1;
            maxprofit = Math.max(maxprofit , diff);
            m1= Math.min(m1,prices[i]); 
        }
    return maxprofit;
    }
}