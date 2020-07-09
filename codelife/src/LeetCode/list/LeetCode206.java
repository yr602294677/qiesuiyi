package LeetCode.list;

/**
 * @program: WorkCode_Git
 * @description: 链表反转
 * @author: 且随意
 * @create: 2020-04-01 09:35
 **/
public class LeetCode206 {

  //迭代法
  public static ListNode reverseListByIteration(ListNode head) {
    ListNode pre = null;
    ListNode cur = head;
    while (cur != null) {
      ListNode next = cur.next;
      cur.next = pre;
      pre = cur;
      cur = next;
    }
    return pre;
  }

  //递归法
  public static ListNode reverseListByRecursion(ListNode head) {
    if(head==null||head.next==null) return  head;
    ListNode pre=reverseListByRecursion(head.next);
    head.next.next=head;
    head.next=null;
    return pre;
  }
  public static void main(String[] args) {
    ListNode test1 = new ListNode(1);
    ListNode test2 = new ListNode(2);
    ListNode test3 = new ListNode(3);
    test1.next = test2;
    test2.next = test3;
    System.out.println(test1.printListNode(reverseListByIteration(test1)));
  }
}
