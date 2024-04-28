public class Pro121 {

    public int maxProfit(int[] prices) {
        int buy = prices[0], length = prices.length, profit = 0;
        for (int i = 1; i < length; i++) {
            if (buy < prices[i]) {
                profit = profit + (prices[i] - buy);
            }
                buy = prices[i];
        }
        return profit;
    }

}
