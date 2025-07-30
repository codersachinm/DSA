package algorithms.array.dp;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    public static int maxProfit(int[] prices) {
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
