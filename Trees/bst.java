package Trees;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int data) {
    this.val = data;
    this.left = null;
    this.right = null;
  }
}

public class bst {
  public static boolean isBST(TreeNode root) {
    return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);

  }

  public static boolean isBSTUtil(TreeNode Node, int min, int max) {
    if (Node == null) {
      return true;
    }
    if (Node.val < min || Node.val > max) {
      return false;
    }
    return (isBSTUtil(Node.left, min, Node.val - 1) && isBSTUtil(Node.right, Node.val + 1, max));

  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(3);
    root.right = new TreeNode(7);
    root.left.left = new TreeNode(1);
    root.left.right = new TreeNode(4);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(8);

    if (isBST(root))
      System.out.println("The binary tree is a binary search tree.");
    else
      System.out.println("The binary tree is not a binary search tree.");
  }
}
