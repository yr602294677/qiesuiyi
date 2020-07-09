package LeetCode.array;

public class LeetCode283 {
  public static void moveZeroes(int[] nums) {
    int count=0;
    for (int i = 0; i <nums.length ; i++) {
      if(nums[i]==0){
        count++;
      }else{
        nums[i-count]=nums[i];
      }
    }
    for (int j = nums.length-count; j <nums.length ; j++) {
      nums[j]=0;
    }
  }

  public static void main(String[] args) {
    int nums[]={0,5,2,0,3};
    LeetCode283.moveZeroes(nums);
    for(int num:nums){
      System.out.println(num);
    }
  }
}
