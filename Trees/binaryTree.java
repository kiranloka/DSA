package Trees;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public  TreeNode(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
}


public class binaryTree {
    TreeNode root;
        public binaryTree(){
            root=null;
        }

    public void preOrderTraversal(TreeNode Node){
        if(Node!=null){
            System.out.println(Node.val+" ");
            preOrderTraversal(Node.left);
            preOrderTraversal(Node.right);
        }
    }   
    public void inOrderTraversal(TreeNode Node){
        if(Node!=null){
            inOrderTraversal(Node.left);
            System.out.println(Node.val+" ");
            inOrderTraversal(Node.right);
        }

    } 
    public void postOrderTraversal(TreeNode Node){
        if(Node!=null){
            postOrderTraversal(Node.left);
            postOrderTraversal(Node.right);
            System.out.println(Node.val+" ");
        }
    }
    public static void main(String[] args) {
        binaryTree tree = new binaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        System.out.println("In-order traversal:");
        tree.inOrderTraversal(tree.root);
        System.out.println();

        System.out.println("Pre-order traversal:");
        tree.preOrderTraversal(tree.root);
        System.out.println();

        System.out.println("Post-order traversal:");
        tree.postOrderTraversal(tree.root);
        System.out.println();
        
    }
}
