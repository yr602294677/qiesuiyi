package sort;

/**
 * @program: WorkCode_Git
 * @description: 冒泡排序
 * @author: 且随意
 * @create: 2020-07-07 07:04
 **/
public class BubbleSort {

  public int[] bubbleSort(int[] nums) {
    int height = nums.length;
    int temp;
    while (height > 1) {
      for (int i = 0; i < height - 1; i++) {

        if (nums[i] > nums[i + 1]) {
          temp = nums[i + 1];
          nums[i + 1] = nums[i];
          nums[i] = temp;
        }
      }
      height--;
      for (int m = 0; m < nums.length; m++) {
        System.out.print(nums[m] + " ");
      }
      System.out.println("");
    }
    return nums;
  }

  public static void main(String[] args) {
    int nums[] = {6, 17, 2, 8, 32, 5, 3, 9};
    BubbleSort bubbleSort = new BubbleSort();
    bubbleSort.bubbleSort(nums);
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + " ");
    }
  }
}