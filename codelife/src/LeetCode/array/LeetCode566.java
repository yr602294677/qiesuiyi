package LeetCode.array;

public class LeetCode566 {

  public static int[][] matrixReshape(int[][] nums, int r, int c) {
    if(nums.length*nums[0].length!=r*c){
      return nums;
    }
    int index=0;
    int[][] result = new int[r][c];
    for (int i = 0; i <nums.length ; i++) {
      for (int j = 0; j <nums[i].length ; j++) {
        result[index/c][index%c]=nums[i][j];
        index++;
      }
    }
    return  result;
  }

  public static void main(String[] args) {
    int[][] nums={{1,2,3,4}};
    System.out.println(nums[0].length);
    System.out.println(nums.length);
    System.out.println(matrixReshape(nums,2,2));
  }
}
