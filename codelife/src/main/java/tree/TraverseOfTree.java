package tree;

import dataStructure.TreeNode;

/**
 * @program: WorkCode_Git
 * @description: 树的遍历
 * @author: 且随意
 * @create: 2020-07-13 19:37
 **/
public class TraverseOfTree {

  public static void main(String[] args) {
    TreeNode test=new TreeNode(1);
    TreeNode right=new TreeNode(7);
    TreeNode rLeft=new TreeNode(9);
    TreeNode left=new TreeNode(5);
    test.left=left;
    right.left=rLeft;
    test.right=right;
    System.out.print("前序：");
    PreOrderTraverse(test);
    System.out.println();
    System.out.print("中序：");
    InOrderTraverse(test);
    System.out.println();
    System.out.print("后序：");
    PostOrderTraverse(test);
  }
  public static void PreOrderTraverse(TreeNode tree){
    if (tree==null) return;
    System.out.print(tree.val+" ");
    if(tree.left!=null){
      PreOrderTraverse(tree.left);
    }
    if(tree.right!=null){
      PreOrderTraverse(tree.right);
    }
    return ;
  }
  public static void InOrderTraverse(TreeNode tree){
    if (tree==null) return;
    if(tree.left!=null){
      InOrderTraverse(tree.left);
    }
    System.out.print(tree.val+" ");
    if(tree.right!=null){
      InOrderTraverse(tree.right);
    }
    return ;
  }

  public static void PostOrderTraverse(TreeNode tree){
    if (tree==null) return;
    if(tree.left!=null){
      PostOrderTraverse(tree.left);
    }
    if(tree.right!=null){
      PostOrderTraverse(tree.right);
    }
    System.out.print(tree.val+" ");
    return ;
  }
}
