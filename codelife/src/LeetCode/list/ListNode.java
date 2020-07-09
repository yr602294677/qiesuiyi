package LeetCode.list;

/**
 * @program: WorkCode_Git
 * @description: 链表结构
 * @author: 且随意
 * @create: 2020-04-01 09:36
 **/
public class ListNode {

  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
  }
  public String printListNode(ListNode listNode){
    StringBuffer stringBuffer=new StringBuffer("");
    while(listNode!=null){
      stringBuffer.append(listNode.val+" ");
      listNode=listNode.next;
    }
    return stringBuffer.toString();
  }
}
