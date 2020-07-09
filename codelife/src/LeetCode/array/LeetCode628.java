package LeetCode.array;

import java.util.Arrays;

public class LeetCode628 {

  public static int maximumProduct(int[] nums) {
    int max=Integer.MIN_VALUE;
    int length=nums.length;
    if(length<3){
      return 0;
    }
    Arrays.sort(nums);
    if(nums[0]<0&&nums[1]<0){
      max=nums[0]*nums[1]*nums[length-1]>nums[length-1]*nums[length-2]*nums[length-3]?nums[0]*nums[1]*nums[length-1]:nums[length-1]*nums[length-2]*nums[length-3];
    }else{
      max=nums[length-1]*nums[length-2]*nums[length-3];
    }

    return max;
  }

  public static void main(String[] args) {
    int[] nums={1,-4,-2,-3};
    System.out.println(maximumProduct(nums));
  }
}
