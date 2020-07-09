package LeetCode.array;

public class LeetCode53 {
//		public static int maxSubArray(int[] nums) {
//			int ans = nums[0];
//			int sum = 0;
//			for (int num : nums) {
//				if (sum > 0) {
//					sum += num;
//				} else {
//					sum = num;
//				}
//				
//				ans = Math.max(ans, sum);
//				System.out.println(num+" "+sum+" "+ans);
//			}
//			return ans;
//		}
	

	public static int maxSubArray(int[] nums) {	
		int sum = 0;
		int max = nums[0];
		
		for(int i=0;i<nums.length;i++) {
			if(sum>0) {
				sum=sum+nums[i];
			}else {
				sum=nums[i];
			}
			max=sum>max?sum:max;
			System.out.println(nums[i]+" "+sum+" "+max);
		}
		
//
//		for (int i = 0; i < nums.length; i++) {
//			if (nums[i] < 0) {
//				continue;
//			}
//			sum = 0;
//			for (int j = i; j < nums.length; j++) {
//
//				sum = sum + nums[j];
//				if (sum < 0) {
//					break;
//				}
//
//				if (sum > max) {
//					max = sum;
//				}
//			}
//
//		}
//
//		if (max == 0) {
//			max = nums[0];
//			for (int m = 0; m < nums.length; m++) {
//				if (nums[m] > max) {
//					max = nums[m];
//				}
//			}
//		}
		return max;
	}

	public static void main(String[] args) {
		int[] nums = { -2};
		int a = maxSubArray(nums);
		System.out.println(a);
	}
}
