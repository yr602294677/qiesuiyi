package swordtooffer;

/**
 * @program: WorkCode_Git
 * @description: 删除链表节点
 * @author: 且随意
 * @create: 2020-09-03 11:56
 **/
public class swordToOffer18 {
  //虚拟节点  双指针
  public static ListNode deleteNodeWithVirtualNode(ListNode head, int val) {
    ListNode virtualNode=new ListNode(0);
    virtualNode.next=head;
    ListNode pre=virtualNode;
    ListNode cur=head;
    while(cur!=null){
      if(cur.val==val){
        pre.next=cur.next;
        break;
      }else{
        pre=pre.next;
        cur=cur.next;
      }
    }
    return virtualNode.next;
  }
  //无虚拟节点 双指针
  public static ListNode deleteNodeWithoutVirtualNode(ListNode head, int val) {
    if(head==null){
      return head;
    }
    if (head.val==val){
      return head.next;
    }
    ListNode cur=head;
    while (cur.next!=null){
      if(cur.next.val==val){
        cur.next=cur.next.next;
      }else {
        cur=cur.next;
      }
    }

    return head;
  }
  public static void main(String[] args) {
    ListNode test1 = new ListNode(4);
    ListNode test2 = new ListNode(5);
    ListNode test3 = new ListNode(1);
    ListNode test4 = new ListNode(9);

    test1.next = test2;
    test2.next = test3;
    test3.next=test4;

    ListNode result=deleteNodeWithoutVirtualNode(test1,1);
    while(result!=null){
      System.out.print(result.val+"   ");
      result=result.next;
    }

  }
}
