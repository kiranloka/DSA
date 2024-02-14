package Trees;
class Node{
    int data;
    Node left;
    Node right;
    Node(int item){
        data=item;
        left=right=null;
    }
}
public class balancedTree {
    Node root;
    balancedTree(){
        root=null;
    }
    int height(Node root){
        if(root==null){
            return 0;
        }else{
            int leftHeight=height(root.left);
            int rightHeight=height(root.right);
            if(leftHeight>rightHeight){
                return leftHeight+1;
            }else{
                return rightHeight+1;
        }
        
        }
    }
    boolean isBalanced(Node node){
        if(node==null){
            return true;
        }

        int leftHeight =height(root.left);
        int rightHeight=height(root.right);
        if(Math.abs(leftHeight-rightHeight)<=1 && isBalanced(node.left) && isBalanced(node.right)){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        balancedTree tree = new balancedTree();

        // Construct sample binary tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        if (tree.isBalanced(tree.root))
            System.out.println("Tree is balanced");
        else
            System.out.println("Tree is not balanced");
    }
}
