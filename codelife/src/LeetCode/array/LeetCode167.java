package LeetCode.array;

public class LeetCode167 {
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                result[0] = i + 1;
                result[1] = j + 1;
                return result;
            } else if (numbers[i] + numbers[j] < target) {
                i++;
            } else {
                j--;
            }

        }
        return result;

    }

    public static void main(String[] args) {

        int[] numbers = { 2, 5, 7, 9, 11 };
        int[] result = LeetCode167.twoSum(numbers, 9);
        for (int number : result) {
            System.out.println(number);
        }
    }

}
