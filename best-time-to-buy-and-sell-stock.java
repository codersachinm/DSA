class Solution {
    public int maxProfit(int[] prices) {
        int least = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (least > prices[i]) {
                least = prices[i];
            }
            if (profit < (prices[i] - least)) {
                profit = prices[i] - least;
            }
        }

        return profit;
    }
}
