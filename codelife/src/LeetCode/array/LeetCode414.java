package LeetCode.array;


public class LeetCode414 {

  public static int thirdMax(int[] nums) {
    Long first = Long.MIN_VALUE, second = Long.MIN_VALUE, third = Long.MIN_VALUE;
    for (long num : nums) {
      if (num > first) {
        third = second;
        second = first;
        first = num;
      } else if (num > second && num < first) {
        third = second;
        second = num;
      } else if (num > third && num < second) {
        third = num;
      }

    }
    return (third == Long.MIN_VALUE || third == second) ? first.intValue() : third.intValue();
  }

  public static void main(String[] args) {
    int nums[] = {1, 5};
    System.out.println(LeetCode414.thirdMax(nums));
  }
}
