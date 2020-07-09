package LeetCode.array;

import java.util.Arrays;

public class LeetCode581 {
  public static int findUnsortedSubarray(int[] nums) {
    int[] temp = new int[nums.length];
    for(int m=0;m<nums.length;m++){
      temp[m]=nums[m];
    }
    Arrays.sort(temp);
    int result=0,max=0,min=0;
    for (int i = 0; i <nums.length ; i++) {
      if(nums[i]!=temp[i]){
        min=i;
        break;
      }
    }
    for (int j = nums.length-1; j>0; j--) {
      if(nums[j]!=temp[j]){
        max=j;
        break;
      }
    }
    result=(max==min?0:max-min+1);
    return result;
  }

  public static void main(String[] args) {
    int[] nums={2,15};
    System.out.println(findUnsortedSubarray(nums));
  }
}
