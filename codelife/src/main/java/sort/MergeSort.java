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
      return nums;
    }
    int mid=left+(right-left)/2;
    int[] lArray=mergeSort(nums,left,mid);
    int[] rArray=mergeSort(nums,mid+1,right);
    int[] mergeArray=new int[lArray.length+rArray.length];

    int m=0;
    int i=0;
    int j=0;
    while(i<lArray.length&&j<rArray.length){
      mergeArray[m++]=lArray[i]>rArray[j]?rArray[j++]:lArray[i++];
    }
    while(i<rArray.length){
      mergeArray[m++]=lArray[i++];
    }
    while(j<rArray.length){
      mergeArray[m++]=rArray[j++];
    }
    return mergeArray;
  }

  public static int[] mergeSort1(int[] nums, int l, int h) {
    if (l == h)
      return new int[] { nums[l] };

    int mid = l + (h - l) / 2;
    int[] leftArr = mergeSort(nums, l, mid); //左有序数组
    int[] rightArr = mergeSort(nums, mid + 1, h); //右有序数组
    int[] newNum = new int[leftArr.length + rightArr.length]; //新有序数组

    int m = 0, i = 0, j = 0;
    while (i < leftArr.length && j < rightArr.length) {
      newNum[m++] = leftArr[i] < rightArr[j] ? leftArr[i++] : rightArr[j++];
    }
    while (i < leftArr.length)
      newNum[m++] = leftArr[i++];
    while (j < rightArr.length)
      newNum[m++] = rightArr[j++];
    return newNum;
  }
  public static void main(String[] args) {
    int[] nums = new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 10 };
    int[] newNums = mergeSort1(nums, 0, nums.length - 1);
    for (int x : newNums) {
      System.out.println(x);
    }
  }
}