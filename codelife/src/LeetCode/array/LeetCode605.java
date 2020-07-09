package LeetCode.array;

public class LeetCode605 {
  public static boolean canPlaceFlowers(int[] flowerbed, int n) {
    boolean result = false;
    int count=0;
      for (int i = 0; i <flowerbed.length ; i++) {
        if(flowerbed[i]==0&&(i+1==flowerbed.length||flowerbed[i+1]==0)&&(i==0||flowerbed[i-1]==0)){
          count ++;
          i=i+1;
        }
      }
    result=count>=n?true:false;
    return result;
  }

  public static void main(String[] args) {
    int[] flowerbed = {0,0,0,0};
    System.out.println(canPlaceFlowers(flowerbed, 2));
  }
}
