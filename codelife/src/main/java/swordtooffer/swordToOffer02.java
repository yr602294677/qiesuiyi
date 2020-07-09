package swordtooffer;

import java.util.HashMap;
import java.util.Map;

public class swordToOffer02 {

    public static int findRepeatNumber(int[] nums) {
      Map<Integer,Integer> map=new HashMap<Integer,Integer>();
      for (int i = 0; i <nums.length ; i++) {
        if (map.containsKey(nums[i])){
          return nums[i];
        }else{
          map.put(nums[i],1);
        }
      }
      return -1;
    }

  public static boolean duplicate(int numbers[],int length,int [] duplication) {
    Map<Integer,Integer> map=new HashMap<Integer,Integer>();
    for (int i = 0; i <numbers.length ; i++) {
      if (map.containsKey(numbers[i])){
        return true;
      }else{
        map.put(numbers[i],1);
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int[] nums={1,2,3,6,9,4,8,7};
   // System.out.println(findRepeatNumber(nums));
    System.out.println(duplicate(nums,0,nums));
  }
}
