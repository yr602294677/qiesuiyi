/**
 * @program: WorkCode_Git
 * @description: 1
 * @author: 且随意
 * @create: 2020-06-07 00:17
 **/
public class testForEveryThing {
  public static void main(String[] args) {
    String 杨锐今天喜欢的歌词="别找了找不到了，上帝已如此忙碌，该来的总会来的，别找了";
    System.out.println(杨锐今天喜欢的歌词.substring(8,15));
  }

  //画心
  private static void draw3R(int n) {
    boolean[][] arr = new boolean[3 * n - 1][4 * n - 1];
    draw3(arr, 0, 0, n, true);
    draw3(arr, 0, 2 * n - 1 + 1, n, true);
    draw3(arr, n, 0, 2 * n - 1, false);
    print(arr);
  }

  private static void print(boolean[][] arr) {
    for (int i = 0; i < arr.length; i += 1) {
      for (int j = 0; j < arr[i].length; j += 1) {
        System.out.print(arr[i][j] ? "*" : " ");
      }
      System.out.println();
    }
  }

  private static void draw3(boolean[][] arr, int x, int y, int n, boolean order) {
    for (int i = 0; i < n; i++) {
      if (order) {
        for (int j = y + (n - i - 1); j <= y + (2 * n - 1) - (n - i); j++) {
          arr[i][j] = true;
        }
      } else {
        for (int j = y + i + 1; j <= y + 2 * n - 1 - i; j++) {
          arr[i+x][j] = true;
        }
      }
    }
  }

}
