package swordtooffer;

/**
 * @program: WorkCode_Git
 * @description: 打印从1到最大的n位数
 * @author: 且随意
 * @create: 2020-06-07 19:25
 **/
public class SwordToOffer17 {

  public static  int[] printNumbers(int n) {
    int end = (int)Math.pow(10, n) - 1;
    int[] res = new int[end];
    for(int i = 0; i < end; i++)
      res[i] = i + 1;
    return res;
  }

  public static void main(String[] args) {
    System.out.println(printNumbers(5));
  }
}
