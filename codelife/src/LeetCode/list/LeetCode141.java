package LeetCode.list;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @program: WorkCode_Git
 * @description: 环形链表检测
 * @author: 且随意
 * @create: 2020-04-01 10:15
 **/
public class LeetCode141 {

  //快慢指针
  public static boolean hasCycle(ListNode head) {
    if (head == null || head.next == null) {
      return false;
    }
    ListNode slow=head;
    ListNode fast=head.next;
    while(slow!=fast){
      if(fast == null || fast.next == null){
        return false;
      }
      slow=slow.next;
      fast=fast.next.next;
    }
    return true;
  }
  //哈希表
  public static boolean hasCycleByHash(ListNode head) {
    Set<ListNode> set = new HashSet();
    while(head!=null){
      if(set.contains(head)){
          return true;
      }else{
          set.add(head);
      }
      head=head.next;
    }
    return false;
  }
  public static void main(String[] args) {
    ListNode test1 = new ListNode(1);
    ListNode test2 = new ListNode(2);
    ListNode test3 = new ListNode(3);
    test1.next = test2;
    test2.next = test3;
    System.out.println(hasCycle(test1));
    //Arrays arrays = {1,2,3,5,7,9};
    int[] nums = {1,2,3,5,7,9};
    Arrays.sort(nums);

  }
}
