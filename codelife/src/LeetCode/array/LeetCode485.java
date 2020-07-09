package LeetCode.array;

public class LeetCode485 {
  //网页写的  没有main
  public int findMaxConsecutiveOnes(int[] nums) {
    int max=0;
    int tempResult=0;

    for (int i=0;i<nums.length;i++){

      if(nums[i]==1){
        tempResult++;
      }else{
        max=max>tempResult?max:tempResult;
        tempResult=0;
      }
    }
    max=max>tempResult?max:tempResult;
    return max;
  }
}
