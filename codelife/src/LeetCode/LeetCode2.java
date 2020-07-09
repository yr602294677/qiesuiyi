package LeetCode;

public class LeetCode2 {

  static class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
      val = x;
    }
  }
  public static  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode pre=new ListNode(0);
    ListNode cur=pre;
    int carry = 0;
    int sum=0;
    while (l1!=null||l2!=null){
      int x= l1==null?0:l1.val;
      int y= l2==null?0:l2.val;
      sum =x+y+carry;
      carry=sum/10;
      sum=sum%10;
      cur.next=new ListNode(sum);
      cur=cur.next;
      if(l1!=null) l1=l1.next;
      if(l2!=null) l2=l2.next;
    }
    if(carry==1){
      cur.next=new ListNode(1);
    }
    return pre.next;
  }
  public static void main(String[] args) {
    ListNode ln1=new ListNode(5);
    ln1.next=new ListNode(3);
    ln1.next.next=new ListNode(1);
    ListNode ln2=new ListNode(6);
    ln2.next=new ListNode(4);
    ln2.next.next=new ListNode(2);
    ListNode result = addTwoNumbers(ln1,ln2);
    while(result.next!=null){
      System.out.println(result.val);
      result=result.next;
    }
//    System.out.println(result.val);
  }
}
