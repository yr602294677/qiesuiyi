/**
 * @program: WorkCode_Git
 * @description: 解析Arrays.sort方法
 * @author: 且随意
 * @create: 2020-04-03 11:06
 **/
public class ArraySort {

 public static void  checkStructured(int[] a){
   int left=0;
   int right=a.length-1;
   int[] run = new int[68];
   int count = 0; run[0] = left;
   for (int k = left; k < right; run[count] = k) {
     if (a[k] < a[k + 1]) { // ascending
       System.out.println("1:***  a[k]:"+a[k]+"   a[k+1]:"+a[k+1]);
       while (++k <= right && a[k - 1] <= a[k]);
     } else if (a[k] > a[k + 1]) { // descending
       System.out.println("2:***  a[k]:"+a[k]+"   a[k+1]:"+a[k+1]);
       while (++k <= right && a[k - 1] >= a[k]);
       for (int lo = run[count] - 1, hi = k; ++lo < --hi; ) {
         int t = a[lo]; a[lo] = a[hi]; a[hi] = t;
       }
     } else { // equal
       for (int m = 33; ++k <= right && a[k - 1] == a[k]; ) {
         if (--m == 0) {
           sort(a, left, right, true);
           return;
         }
       }
     }
   }
 }

  private static void sort(int[] a, int left, int right, boolean b) {
  }

  public static void main(String[] args) {
    int[] a={1,9,5,6,7,3,4,5,8,2,1,9};
    checkStructured(a);
  }
}
