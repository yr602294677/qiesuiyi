package swordtooffer;

public class swordToOffer01 {

  public static boolean Find(int target, int[][] array) {
    int row = 0;
    int col = array[0].length - 1;
    int flag;
    while (col >= 0&&row < array.length ) {
      flag = array[row][col];
      if (target < flag) {
        col--;
      } else if (target > flag) {
        row++;
      } else {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    //int[][] array = {{1, 5, 8, 9}, {2, 6, 10, 11}, {4, 13, 16, 22}, {7, 14, 18, 25}};
    int[][] array = {};
    findNumberIn2DArray( array,7);
    System.out.println(Find(7, array));
  }

  public static boolean findNumberIn2DArray(int[][] matrix, int target) {
    int i = matrix.length - 1, j = 0;
    while(i >= 0 && j < matrix[0].length)
    {
      if(matrix[i][j] > target) i--;
      else if(matrix[i][j] < target) j++;
      else return true;
    }
    return false;
  }
}
