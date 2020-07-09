package LeetCode.array;

import java.util.Arrays;

public class LeetCode123 {
    public static int maxProfit(int[] prices) {
        int[] profit = new int[prices.length];
        int maxprofit = 0;
        int valley = 0, peak = 0;
        int i = 0;
        while (i < prices.length - 1) {
            while (i + 1 < prices.length && prices[i] >= prices[i + 1])
                i++;
            valley = prices[i];

            while (i + 1 < prices.length && prices[i] <= prices[i + 1])
                i++;
            peak = prices[i];
            profit[i] = peak - valley;
        }
        Arrays.sort(profit);
        if (prices.length >= 2) {
            maxprofit = profit[prices.length - 1] + profit[prices.length - 2];
        }

        return maxprofit;
    }

    public static void main(String[] args) {

        int[] prices = { 1, 2, 4, 2, 5, 7, 2, 4, 9, 0 };
        int result = LeetCode123.maxProfit(prices);
        System.out.println(result);
    }
}
