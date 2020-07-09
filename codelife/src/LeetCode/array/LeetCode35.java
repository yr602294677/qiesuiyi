package LeetCode.array;

import java.util.Arrays;

public class LeetCode35 {
	public int searchInsert(int[] nums, int target) {

		int res = Arrays.binarySearch(nums, target);
		if (res >= 0) {
			return res;
		} else {
			return -res - 1;
		}

		// int i;
		// for (i = 0; i < nums.length; i++) {
		// if (target == nums[i]) {
		// break;
		// }
		// }
		// return i;
		
		
		
//int[] a=nums     key = target
//		binarySearch0(a, 0, a.length, key)
//		 binarySearch0(int[] a, int fromIndex, int toIndex, int key)		
		
		
//        int low = fromIndex;
//        int high = toIndex - 1;
//
//        while (low <= high) {
//            int mid = (low + high) >>> 1;
//            int midVal = a[mid];
//
//            if (midVal < key)
//                low = mid + 1;
//            else if (midVal > key)
//                high = mid - 1;
//            else
//                return mid; // key found
//        }
//        return -(low + 1);  // key not found.
	}
	public static void main(String[] args) {
		int[] nums= {1,7,8,9};
		int target =7;
		LeetCode35 demo=new LeetCode35();
		System.out.println(demo.searchInsert(nums, target));
		
	}
}
