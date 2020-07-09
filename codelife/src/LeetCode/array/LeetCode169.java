package LeetCode.array;

public class LeetCode169 {
    public static int majorityElement(int[] nums) {
        int amount = 1;
        int tempResult = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (tempResult == nums[i]) {
                amount++;
            } else {
                amount--;
            }
            while (amount == 0) {
                tempResult = nums[i];
                amount = 1;
            }
        }
        return tempResult;

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 3, 3, 5, 5, 5, 5, };
        System.out.println(LeetCode169.majorityElement(nums));
    }
}
