
class TreeNode {
  int val;
  TreeNode left, right;

  TreeNode(int data) {
    this.val = data;
    left = right = null;
  }
}

class NodesFromDistance {
  TreeNode root;

  NodesFromDistance() {
    root = null;
  }

  void printNodesFromDistanceK(TreeNode node, int k) {
    if (node == null || k < 0) {
      return;
    }
    if (k == 0) {
      System.out.println(node.val + " ");
      return;
    } else {
      printNodesFromDistanceK(node.left, k - 1);
      printNodesFromDistanceK(node.right, k - 1);
    }
  }

  int findDistance(TreeNode root, TreeNode target, int k) {
    if (root == null) {
      return -1;
    }
    if (root == target) {
      printNodesFromDistanceK(root, k);
      return 0;

    }
    int left = findDistance(root.left, target, k);
    int right = findDistance(root.right, target, k);

    if (left >= 0) {
      if (left + 1 == k) {
        System.out.println(root.val + " ");

      } else {
        printNodesFromDistanceK(root.right, k - left - 2);
      }
      return left + 1;
    }
    if (right >= 0) {
      if (right + 1 == k) {
        System.out.println(root.val + " ");
      } else {
        printNodesFromDistanceK(root.left, k - right - 2);
      }
      return right + 1;

    }
    return right + 1;
  }

  public static void main(String[] args) {
    NodesFromDistance tree = new NodesFromDistance();

    tree.root = new TreeNode(1);
    tree.root.left = new TreeNode(2);
    tree.root.right = new TreeNode(3);
    tree.root.left.left = new TreeNode(4);
    tree.root.left.right = new TreeNode(5);

    TreeNode target = tree.root.left;
    int k = 2;
    tree.findDistance(tree.root, target, k);

  }

}
