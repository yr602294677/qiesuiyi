package swordtooffer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @program: WorkCode_Git
 * @description: 从尾到头打印链表
 * @author: 且随意
 * @create: 2020-05-07 15:10
 **/
public class SwordToOffer06 {

  /**
   * 将链表的值正序放到一个list中，再倒序遍历该list放入数组中返回
   * @param head 链表
   * @return 数组
   */
  public static int[] reversePrint(ListNode head) {

    List list=new ArrayList(16);
    while(head!=null){
      list.add(head.val);
      head=head.next;
    }
    int[] result=new int[list.size()];
    int index=0;
    for (int i = list.size()-1; i >=0 ; i--) {
       result[index++]= (int) list.get(i);
    }
    return result;
  }

  /**
   * 通过栈实现链表元素反转输出
   * @param head
   * @return
   */
  private static  int[] reversePrintByStack(ListNode head) {
    Stack<ListNode> stack = new Stack<ListNode>();
    while (head!=null){
      stack.push(head);
      head=head.next;
    }
    int size=stack.size();
    int[] result=new int[size];
    for (int i = 0; i <size ; i++) {
      result[i]=stack.pop().val;
    }
    return result;
  }

  public static void main(String[] args) {
    ListNode test1 = new ListNode(2);
    ListNode test2 = new ListNode(4);
    ListNode test3 = new ListNode(1);
    test1.next = test2;
    test2.next = test3;
    //System.out.println(reversePrint(test1));
    System.out.println(reversePrintByStack(test1));

  }


}
