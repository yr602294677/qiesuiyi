package LeetCode.array;

public class LeetCode643 {
  public static double findMaxAverage(int[] nums, int k) {
    double sum = 0,temp=0,max;
    for(int j=0;j<k;j++){
    sum+=nums[j];
  }
  max=sum;
    temp =sum;
  double result;
  if(nums.length<k)return 0;
  for(int i=k;i<nums.length;i++){
    temp=temp+nums[i]-nums[i-k];
    max=max>temp?max:temp;
  }
  result=(double)max/k;
    return result;
}

  public static void main(String[] args) {
    int[] nums={4,2,1,3,3};
    System.out.println(findMaxAverage(nums,2));
  }
}
