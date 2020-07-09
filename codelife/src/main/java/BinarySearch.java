import java.util.Arrays;

/**
 * @program: WorkCode_Git
 * @description: 二分法
 * @author: 且随意
 * @create: 2020-04-03 17:13
 **/
public class BinarySearch {

  public static void main(String[] args) {
    int[] array = {8, 11, 19, 23, 27, 33, 45, 55, 67, 98};
    int[] array2={1,3,4,5,6,8,8,8,11,13,18};
    Arrays.sort(array);
    //System.out.println(binarySearch(array, 11));
    //System.out.println(binarySearchByRecursion(array, 12,0,array.length-1));
    System.out.println(findFirstElementEqualsTarget(array2, 8));
  }

  /**
   * 查询有序数组中是否有目标值
   *
   * @param array  有序数组
   * @param target 待查询值
   * @return 是否含有目标值
   */
  private static boolean binarySearch(int[] array, int target) {
    int left = 0;
    int right = array.length - 1;
    int mid;
    while (left <= right) {
      mid = (left + right) / 2;
      if (target == array[mid]) {
        return true;
      } else if (target < array[mid]) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return false;
  }

  /**
   * 递归查询有序数组中是否含有目标值
   *
   * @param array
   * @param target
   * @param left
   * @param right
   * @return
   */
  private static boolean binarySearchByRecursion(int[] array, int target, int left, int right) {
    int mid = (left + right) / 2;
    if (left <= right) {
      if (target == array[mid]) {
        return true;
      } else if (target < array[mid]) {
        return binarySearchByRecursion(array, target, left, mid - 1);
      } else {
        return binarySearchByRecursion(array, target, mid + 1, right);
      }
    }else{
      return false;
    }
  }

  /**
   * 查找第一个等于给定值的元素
   * @param array
   * @param target
   * @return
   */
  private static int findFirstElementEqualsTarget(int[] array, int target){
    int left = 0;
    int right = array.length - 1;
    int mid;
    while (left <= right) {
      mid = (left + right) / 2;
      if (target == array[mid]) {
        if(array[mid-1]!=target||mid==0){
          return mid;
        }else{
          right=mid-1;
        }

      } else if (target < array[mid]) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return -1;
  }

  /**
   * 查找第一个大于等于给定值的元素
   * @param array
   * @param target
   * @return
   */
  private static int findFirstElementEqualsOrBiggerTarget(int[] array, int target){
    int left = 0;
    int right = array.length - 1;
    int mid;
    while (left <= right) {
      mid = (left + right) / 2;
      if (target > array[mid]) {
        left = mid + 1;
      } else {
        //如果a[mid]前面已经没有元素，或者前面一个元素小于要查找的值value，那a[mid]就是我们要找的元素。
        if(array[mid-1]<target||mid==0){
          return mid;
        }else{
          right=mid-1;
        }
      }
    }
    return -1;
  }
}
