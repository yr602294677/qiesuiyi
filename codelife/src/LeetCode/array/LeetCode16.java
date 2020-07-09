package LeetCode.array;

import java.util.Arrays;

public class LeetCode16 {

  public static void main(String[] args) {
    int[] nums = {1,2,4,8,16,32,64,128};
    System.out.println(threeSumClosest(nums, 82));
  }

  public static int threeSumClosest(int[] nums, int target) {
    Arrays.sort(nums);
    if (nums.length < 3) {
      return -1;
    }
    int result = nums[0] + nums[1] + nums[2];
    int tempresult, l, r;
    for (int i = 0; i < nums.length - 2; i++) {
      l = i + 1;
      r = nums.length - 1;
      while (l<r){
        tempresult = nums[i] + nums[l] + nums[r];
        Boolean flag = Math.abs(tempresult - target) > Math.abs(result - target);
        result = flag ? result : tempresult;
        if (result>target) {
          r--;
        } else if (result<target) {
          l++;
        } else {
          return target;
        }
      }



    }
    return result;
  }
}
