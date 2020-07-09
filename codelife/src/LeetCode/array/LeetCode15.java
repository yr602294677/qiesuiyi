package LeetCode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode15 {

  public static void main(String[] args) {
    int[] nums ={0,0,0,0};
    List<List<Integer>> results=threeSum1(nums);
    for(List<Integer> result:results){
        for(int num:result){
          System.out.println(num);
        }
      System.out.println(" ");
      }

}
  public static List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> ans = new ArrayList();
    int len = nums.length;
    if(nums == null || len < 3) return ans;
    Arrays.sort(nums); // 排序
    for (int i = 0; i < len ; i++) {
      if(nums[i] > 0) break; // 如果当前数字大于0，则三数之和一定大于0，所以结束循环
      if(i > 0 && nums[i] == nums[i-1]) continue; // 去重
      int L = i+1;
      int R = len-1;
      while(L < R){
        int sum = nums[i] + nums[L] + nums[R];
        if(sum == 0){
          ans.add(Arrays.asList(nums[i],nums[L],nums[R]));
          while (L<R && nums[L] == nums[L+1]) L++; // 去重
          while (L<R && nums[R] == nums[R-1]) R--; // 去重
          L++;
          R--;
        }
        else if (sum < 0) L++;
        else if (sum > 0) R--;
      }
    }
    return ans;
  }


  private static List<List<Integer>> threeSum1(int[] nums) {
    List<List<Integer>> results=new ArrayList<>();
    Arrays.sort(nums);
    int right,left,tempSum;
    for (int i = 0; i <nums.length ; i++) {
      right=nums.length-1;
      left = i+1;
      if(nums[i]>0)break;
      //[0,0,0,0] 不加下面一行 会出现两个{0,0,0}
      if(i>0&&nums[i]==nums[i-1]) continue;
      while(left<right){
        tempSum=nums[i]+nums[left]+nums[right];
        if(tempSum==0){
          results.add(Arrays.asList(nums[i],nums[left],nums[right]));
          //[-2,0,0,2,2] 不加下面两行  会输出相同结果
          while(left<right&&nums[left]==nums[left+1])left++;
          while(left<right&&nums[right]==nums[right-1])right--;
          left++;
          right--;
        }
        else if(tempSum<0){
          left++;
        }else{
          right--;
        }
      }
    }
    return results;
  }
}
