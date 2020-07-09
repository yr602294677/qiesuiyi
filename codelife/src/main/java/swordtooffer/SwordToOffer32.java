package swordtooffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @program: WorkCode_Git
 * @description: 从上到下打印二叉树
 * @author: 且随意
 * @create: 2020-05-22 10:30
 **/
public class SwordToOffer32 {

  /**
   * 层序遍历二叉树 如给定二叉树: [3,9,20,null,null,15,7],返回[3,9,20,15,7]
   *
   * @param root
   * @return
   */
  public static int[] levelOrder(TreeNode root) {
    if (root == null) {
      return new int[0];
    }
    Queue<TreeNode> queue = new LinkedList();
    queue.add(root);
    List<Integer> array = new ArrayList<Integer>();
    TreeNode node;
    while (!queue.isEmpty()) {
      //移除并返回队列头部元素
      node = queue.poll();
      array.add(node.val);
      //左右子树放入队列
      if (node.left != null) {
        queue.add(node.left);
      }
      if (node.right != null) {
        queue.add(node.right);
      }
    }
    int[] result = new int[array.size()];
    for (int i = 0; i < array.size(); i++) {
      result[i] = array.get(i);
    }
    return result;
  }

  /**
   * 从上到下打印二叉树，结果按行返回 如给定二叉树: [3,9,20,null,null,15,7],返回[[3],[9,20],[15,7]] 难点：遍历序列
   *
   * @param root
   * @return
   */
  public static List<List<Integer>> levelOrderByRow(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
    Queue<TreeNode> queue = new LinkedList();
    queue.add(root);
    TreeNode node;
    while (!queue.isEmpty()) {
      //移除并返回队列头部元素
      //list在循环内部初始化，保证外层list添加时每次都是新的
      List<Integer> list = new ArrayList<>();
      for (int i = queue.size(); i > 0; i--) {
        node = queue.poll();
        list.add(node.val);
        //左右子树放入队列
        if (node.left != null) {
          queue.add(node.left);
        }
        if (node.right != null) {
          queue.add(node.right);
        }
      }
      result.add(list);
    }
    return result;
  }

  /**
   * 从上到下之字形打印二叉树，结果按行返回 如给定二叉树: [3,9,20,null,null,15,7],返回[[3],[20,9],[15,7]] 难点：根据结果list的size判断奇偶数（决定正反向打印），正向则放入队列头部，逆向则放入队列尾部
   *
   * @param root
   * @return
   */
  public static List<List<Integer>> levelOrderByTurnRow(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
    Queue<TreeNode> queue = new LinkedList();
    queue.add(root);
    TreeNode node;
    while (!queue.isEmpty()) {
      //移除并返回队列头部元素
      //list在循环内部初始化，保证外层list添加时每次都是新的
      LinkedList<Integer> list = new LinkedList<>();
      for (int i = queue.size(); i > 0; i--) {
        node = queue.poll();
        // 偶数层 -> 队列头部
        if (result.size() % 2 == 0) {
          list.addLast(node.val);
        }
        // 奇数层 -> 队列尾部
        else {
          list.addFirst(node.val);
        }

        //左右子树放入队列
        if (node.left != null) {
          queue.add(node.left);
        }
        if (node.right != null) {
          queue.add(node.right);
        }
      }
      result.add(list);
    }
    return result;
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(3);
    TreeNode l1 = new TreeNode(9);
    TreeNode r1 = new TreeNode(20);
    TreeNode l2 = new TreeNode(1);
    TreeNode r2 = new TreeNode(7);
    root.left = l1;
    root.right = r1;
    r1.left = l2;
    r1.right = r2;
    System.out.println(levelOrderByRow(root));
  }
}
