class Solution {
  public int maxProfit(int[] prices) {
    int least = Integer.MAX_VALUE;;
    int profit = 0;
    int op = 0;

    for (int i = 0; i < prices.length; i++) {
      if (prices[i] < least) {
        least = prices[i];
      }
      profit = prices[i] - least;
      if (op < profit) {
        op = profit;
      }
    }
    return op;
  }
}
