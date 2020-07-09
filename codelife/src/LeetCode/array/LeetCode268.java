package LeetCode.array;

import java.util.HashSet;

public class LeetCode268 {
  public static  int missingNumber(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    for(int num:nums) set.add(num);

    for (int i = 0; i <nums.length+1 ; i++) {
      if(!set.contains(i)) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] nums={3,0,1};
    System.out.println(LeetCode268.missingNumber(nums));
  }
}
