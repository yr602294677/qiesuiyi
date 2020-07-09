package LeetCode.tree;

import java.util.ArrayList;
import java.util.List;

public class Traversal {

  private static List<Integer> list=new ArrayList<Integer>();

  public static List<Integer> preorderTraversal(TreeNode root) {

    list.add(root.val);
    TreeNode left=root.left;
    TreeNode right=root.right;
    if(left!=null){
      preorderTraversal(left);
    }
    if(right!=null){
      preorderTraversal(right);
    }
    return list;
  }

  public static void main(String[] args) {
    TreeNode test=new TreeNode(1);
    TreeNode right=new TreeNode(2);
    TreeNode rLeft=new TreeNode(3);
    test.left=null;
    right.left=rLeft;
    test.right=right;
    List<Integer> list=preorderTraversal(test);
    System.out.println(list);
  }
}
