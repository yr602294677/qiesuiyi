package LeetCode.dp;

public class LeetCode70 {

  public static void main(String[] args) {
    System.out.println(climbStairs(3));
  }
  //动态规划
  public static  int climbStairs(int n) {
    if (n == 1) {
      return 1;
    }
    int[] dp = new int[n + 1];
    dp[1] = 1;
    dp[2] = 2;
    for (int i = 3; i <= n; i++) {
      dp[i] = dp[i - 1] + dp[i - 2];
    }
    return dp[n];
  }

  //斐波那契
  public static int climbStairs1(int n) {
    if(n==1)return 1;
    int first=1,second=2,temp;
    for (int i = 3; i <=n ; i++) {
      temp=first+second;
      first=second;
      second= temp;
    }
    return second;
  }
}
