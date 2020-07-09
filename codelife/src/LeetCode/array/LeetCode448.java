package LeetCode.array;

import java.util.ArrayList;
import java.util.List;

/*
给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。

找到所有在 [1, n] 范围之间没有出现在数组中的数字。

您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。
 */
public class LeetCode448 {
  public static List<Integer> findDisappearedNumbers(int[] nums) {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i <nums.length ;) {
      if(i+1==nums[i]||nums[nums[i]-1]==nums[i]){
        i++;
      }else{
        int temp=nums[i];
        nums[i]=nums[nums[i]-1];
        nums[temp-1]=temp;
      }
//      System.out.println("第几次循环："+i);
//      for(int num:nums){
//        System.out.print(num+"  ");
//      }
//      System.out.print( "\n");
    }

    for (int j = 0; j < nums.length; j++) {
      if(j+1!=nums[j]){
        //System.out.println("nums[j]："+nums[j]+" j:"+j);
        list.add(j+1);
      }
    }
    return list;
  }

  public static void main(String[] args) {
    int[] nums={4,3,2,7,8,2,3,1};
    List<Integer> list=LeetCode448.findDisappearedNumbers(nums);
    for(int num:list){
      System.out.println(num);
    }
  }
}
