package swordtooffer;

import java.util.Arrays;

/**
 * @program: WorkCode_Git
 * @description: 找出最小的k个数
 * @author: 且随意
 * @create: 2020-06-29 21:17
 **/
public class SwordToOffer40 {

  public static int[] getLeastNumbers(int[] arr, int k) {
    Arrays.sort(arr);
    int[] resultArr=new int[k];
    for (int i = 0; i <resultArr.length ; i++) {
      resultArr[i]=arr[i];
    }
    return  resultArr;
  }

  public static void main(String[] args) {
    int[] arr = {4,5,11,6,7,23,3,8};
    int k=3;
    System.out.println(getLeastNumbers(arr,k));
  }
}
