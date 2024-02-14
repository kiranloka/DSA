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


public class treeHeight {
    Node root;

    treeHeight(){
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
    public static void main(String[] args) {
        treeHeight tree = new treeHeight();

        // Construct sample binary tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Height of tree is : " + tree.height(tree.root));
   
    }
    
}
