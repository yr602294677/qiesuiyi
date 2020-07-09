package LeetCode.array;


public class LeetCode27 {
	
	public int removeElement(int[] nums, int val) {
		//��valֵ����������������򸲸�
        int ans = 0;
        for(int num: nums) {
            if(num != val) {
                nums[ans] = num;
                ans++;
            } 
        } 
        return ans; 
		     
//		int a=nums.length;
//		for(int i=0;i<nums.length;i++) {
//			if(nums[i]==val) {
//				a--;
//			}
//		}
//		return a;    
	}
	   
	public static void main(String[] args) {
		int[] nums= {1,2,3,3,3,3,5,9,5};
		int val=3;
		LeetCode27 demo=new LeetCode27();
		int result=demo.removeElement(nums, val);
		System.out.println(result);

	}		

	
}
