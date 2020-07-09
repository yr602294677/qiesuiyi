package swordtooffer;

/**
 * @program: WorkCode_Git
 * @description: 连续子数组的最大和
 * @author: 且随意
 * @create: 2020-06-30 22:42
 **/
public class SwordToOffer42 {

  public static int maxSubArray(int[] nums) {
    int sum=0;
    int max=nums[0];
    for (int i = 0; i < nums.length; i++) {
      if(sum>0){
        sum+=nums[i];
      }else{
        sum=nums[i];
      }
      max=sum>max?sum:max;
    }
    return max;

//    int sum = 0;
//    int max =nums[0];
//
//    for(int i=0;i<nums.length;i++) {
//      if(sum>0) {
//        sum=sum+nums[i];
//      }else {
//        sum=nums[i];
//      }
//      max=sum>max?sum:max;
//    }
//    return max;
  }

  public static void main(String[] args) {
    int[] nums={1};
    System.out.println(maxSubArray(nums));
  }
}
