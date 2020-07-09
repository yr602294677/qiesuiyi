package LeetCode.dp;


public class LeetCode62 {

  public static int uniquePaths(int m, int n) {
    long a=factorial(m+n-2);
    long b=factorial(m-1);
    long c=factorial(n-1);
    System.out.println(a*1.0/b*1.0);
    System.out.println(b*c);
    System.out.println((int)a/b/(int)c);
    return (int) (factorial(m+n-2)/factorial(m-1)/factorial(n-1));
  }

  private static long  factorial(int m) {
    long  result = 1;
    for (int  i = 1; i <m+1 ; i++) {
      result*=i*1.0;
    }
    return result;
  }
  public static void main(String[] args) {
   // System.out.println(factorial(6));
    System.out.println(uniquePaths(23,12));
  }

}
