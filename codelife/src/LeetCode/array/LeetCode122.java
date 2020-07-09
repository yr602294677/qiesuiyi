package LeetCode.array;

/**
 * 可以执行多笔交易 求最大总和
 * 
 * @author yangrui-lc
 *
 */
public class LeetCode122 {
    public static int maxProfit(int[] prices) {

        int maxprofit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                maxprofit += prices[i + 1] - prices[i];
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {

        int[] prices = {};
        System.out.println(LeetCode122.maxProfit(prices));
    }
}
