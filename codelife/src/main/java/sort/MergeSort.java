package sort;

/**
 * @program: WorkCode_Git
 * @description: 归并排序
 * @author: 且随意
 * @create: 2020-07-07 18:57
 **/
public class MergeSort {

  private static int[] mergeSort(int[] nums, int left, int right) {
    if(left==right){
      return new  int[] {nums[left]};
    }
    int mid=left+(right-left)/2;
    int[] lArray=mergeSort(nums,left,mid);
    int[] rArray=mergeSort(nums,mid+1,right);
    int[] mergeArray=new int[lArray.length+rArray.length];

    int m=0;
    int i=0;
    int j=0;
    while(i<lArray.length&&j<rArray.length){
      mergeArray[m++]=lArray[i]<rArray[j]?lArray[i++]:rArray[j++];
    }
    while(i<lArray.length){
      mergeArray[m++]=lArray[i++];
    }
    while(j<rArray.length){
      mergeArray[m++]=rArray[j++];
    }
    return mergeArray;
  }


  public static void main(String[] args) {
    int[] nums = new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 10 };
    int[] newNums = mergeSort(nums, 0, nums.length - 1);
    for (int x : newNums) {
      System.out.print(x+" ");
    }
  }
}