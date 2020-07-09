package LeetCode.array;

public class LeetCode41 {

  public static void main(String[] args) {
    int[] nums={1,3,4,5};
    System.out.println(firstMissingPositive(nums));
  }
  public static int firstMissingPositive(int[] nums) {
    for (int i = 0; i <nums.length ; ) {
      if(nums[i]<=0||nums[i]>nums.length||nums[nums[i]-1]==nums[i]){
          i++;
          continue;
      }
      int tmp=nums[nums[i]-1];
      nums[nums[i]-1]=nums[i];
      nums[i]=tmp;
    }
    for (int j = 0; j <nums.length ; j++) {
      if(nums[j]!=j+1){
        return j+1;
      }
    }
    return nums.length+1;
  }
}
