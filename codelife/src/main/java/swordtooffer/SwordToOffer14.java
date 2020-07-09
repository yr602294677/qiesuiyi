package swordtooffer;

/**
 * @program: WorkCode_Git
 * @description: 剪绳子问题
 * @author: 且随意
 * @create: 2020-06-06 22:24
 **/
public class SwordToOffer14 {

  /**
   * 分情况讨论 对于2<=n<=58
   * 若n<=3,且最少将绳子切做两段，因此返回n-1
   * 若n>3，看余数
   *      余数为0返回3^x,
   *      若余数为1，由于3*1<2*2,所以将最后两端更换为2+2
   *      若余数为2，返回3^x*2
   * @param n 绳子长度
   * @return
   */
  public static  int cuttingRope(int n) {
    if(n<=3) return n-1;
    //remainder 余数
    int remainder = n%3;
    int result = n/3;
    switch (remainder){
      case 0 : return (int) Math.pow(3, result);
      case 1 : return (int) Math.pow(3,result-1)*4;
      case 2 : return (int) Math.pow(3,result)*2;
    }
    return 0;
  }

  public static void main(String[] args) {
    System.out.println(cuttingRope(8));
  }
}
