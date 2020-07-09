package LeetCode.array;

import java.util.HashMap;
import java.util.Set;

public class LeetCode532 {
  public static int findPairs(int[] nums, int k) {
    if(nums.length<2||k<0){
      return 0;
    }
    HashMap<Integer,Integer> hashMap=new HashMap();
    for (int num : nums) {
      hashMap.put(num,  hashMap.getOrDefault(num, 0) + 1);
    }
    Set<Integer> set=hashMap.keySet();
    int result =0;
    for(int key:set){
      int targetKey = k+key;
      if(k==0){
        result +=(hashMap.get(key)>=2?1:0);
      }else{
        if(hashMap.containsKey(targetKey))
          result ++;
      }
    }
    return result ;
  }

  public static void main(String[] args) {
    int[] nums={1,3,1,1,5,4};
    int k = 0;
    System.out.println(LeetCode532.findPairs(nums,k));
  }
}
