package pta;

/**
 * PTA中国大学MOOC-陈越、何钦铭-数据结构-起步能力自测题 https://pintia.cn/problem-sets/17/problems/260
 */
public class PTADataStructureAblityProblemOne {

  /**
   * 打印沙漏
   */
  public static void main(String[] args) {
    printSandglass(1, "*");
  }

  private static void printSandglass(int i, String s) {
    int row = 0;
    int left = 0;
    if (i == 1) {
      System.out.println(s);
      System.out.println(0);
      return ;
    } else {
      for (int m = 0; m < 32; m++) {
        if (i < 2 * m * m - 1) {
          row = m;
          left = i-(2 * (m-1) * (m-1)- 1) ;
          break;
        }
      }
    }
    printSandglass1(row-1, s);
    System.out.println(left);
  }

  private static void printSandglass1(int row, String s) {
    int num=2*row-1;
    int m= row;
    int blank=0;
    for (int i=m;i>1;i--){
      blank=m-i;
      for (int j = 0; j <blank ; j++) {
        System.out.print(" ");
      }
      for (int j=0;j<num;j++){
        System.out.print(s);
      }
      num=num-2;
      System.out.println();
    }
    for (int i = 0; i <row ; i++) {
      blank=row-i-1;
      for (int j = 0; j <blank ; j++) {
        System.out.print(" ");
      }
      for (int j=0;j<num;j++){
        System.out.print(s);
      }
      num=num+2;
      System.out.println();
    }
  }
}
