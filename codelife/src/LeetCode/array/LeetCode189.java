package LeetCode.array;

public class LeetCode189 {
    public static void rotate(int[] nums, int k) {
        int[] temp = new int[nums.length + k];
        // for (int i = 0; i < nums.length; i++) {
        // temp[k + i] = nums[i];
        // }
        // for (int j = 0; j < k; j++) {
        // temp[j] = temp[nums.length + j];
        // }
        for (int i = 0; i < nums.length; i++) {
            temp[(i + k) % nums.length] = nums[i];
        }

        for (int m = 0; m < nums.length; m++) {
            nums[m] = temp[m];
        }

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        LeetCode189.rotate(nums, 2);
        for (int num : nums) {
            System.out.println(num);
        }
    }

}
