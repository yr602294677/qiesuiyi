package swordtooffer;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @program: WorkCode_Git
 * @description: 用两个栈重建队列
 * @author: 且随意
 * @create: 2020-05-07 15:55
 **/
public class SwordToOffer09 {
  Deque<Integer> s1;
  Deque<Integer> s2;
  public SwordToOffer09() {
    s1= new  LinkedList<Integer>();
    s2= new  LinkedList<Integer>();
  }

  public void appendTail(int value) {
    s1.push(value);
  }

  public int deleteHead() {
    if(s2.isEmpty()){
      while (!s1.isEmpty()){
        s2.push(s1.pop());
      }
    }
    if(s2.isEmpty()){
      return -1;
    }else{
      return (s2.pop());
    }
  }
}
