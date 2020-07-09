package swordtooffer;

import java.util.Arrays;

/**
 * @program: WorkCode_Git
 * @description: 出现次数超过数组长度半数的元素
 * @author: 且随意
 * @create: 2020-06-28 22:18
 **/
public class SwordToOffer39 {

  public static int majorityElement(int[] nums) {
    Arrays.sort(nums);
    if(nums.length%2==0){
      return nums[nums.length/2];
    }else{
      return nums[nums.length/2+1];
    }
  }

  public static void main(String[] args) {
    int[] nums ={1, 2, 3, 2, 2, 2, 5, 4, 2};
    System.out.println(majorityElement(nums));
  }
}
