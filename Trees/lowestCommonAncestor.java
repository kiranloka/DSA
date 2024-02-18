
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

public class LowestCommonAncestor {
  public TreeNode lowestCommon(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null || root == p || root == q) {
      return root;
    }
    TreeNode left = lowestCommon(root.left, p, q);
    TreeNode right = lowestCommon(root.right, p, q);
    if (left != null && right != null) {
      return root;
    }
    return (left != null) ? left : right;
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(5);
    root.right = new TreeNode(1);
    root.left.left = new TreeNode(6);
    root.left.right = new TreeNode(2);
    root.right.left = new TreeNode(0);
    root.right.right = new TreeNode(8);
    root.left.right.left = new TreeNode(7);
    root.left.right.right = new TreeNode(4);

    TreeNode p = root.left; // Node with value 5
    TreeNode q = root.right.right; // Node with value 8

    LowestCommonAncestor lcaFinder = new LowestCommonAncestor();
    TreeNode lca = lcaFinder.lowestCommon(root, p, q);
    System.out.println("Lowest Common Ancestor: " + lca.val);
  }
}
