package LeetCode.array;

public class LeetCode121 {
    /**
     * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
     * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。 注意你不能在买入股票前卖出股票
     */

    public static int maxProfit(int[] prices) {
        int max = 0;
        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            max = prices[i] - min > max ? prices[i] - min : max;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 9, 4 };
        System.err.println(Integer.MAX_VALUE);
        System.out.println(maxProfit(prices));
    }
}
