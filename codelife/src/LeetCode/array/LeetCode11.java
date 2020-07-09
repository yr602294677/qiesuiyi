package LeetCode.array;

public class LeetCode11 {

  public static void main(String[] args) {
    int[] height = {1,8,2,5,6,9,3,6};
    int maxArea =maxArea(height);
    System.out.println(maxArea);
  }

  //双指针
  public static int maxArea(int[] height) {
    int maxarea = 0,left=0,right=height.length-1;
    while(left < right){
      maxarea=Math.max(maxarea,Math.min(height[left],height[right])*(right-left));
      if(height[left]<height[right]){
        left++;
      } else{
        right--;
      }
    }
    return maxarea;
  }

// 暴力破解
//  private static int maxArea(int[] height) {
//    int maxArea = height[0]<height[1]?height[0]:height[1];
//    int tempArea = 0;
//    for (int i = 0; i <height.length-1 ; i++) {
//      for (int j = i+1; j <height.length ; j++) {
//        tempArea = (j-i)*(height[i]>height[j]?height[j]:height[i]);
//        System.out.println(i+" "+j+" "+tempArea+"  "+maxArea);
//        maxArea=maxArea>tempArea?maxArea:tempArea;
//
//      }
//    }
//    return maxArea;
//  }
}
