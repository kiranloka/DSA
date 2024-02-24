package Trees;
import java.util.LinkedList;
import java.util.Queue;


public class serializeAndDeserialize{
  public static class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
      this.data=val;
    }
  }

  public String serialize(TreeNode root){
    StringBuilder sb=new StringBuilder();
    serializeHelper(root,sb);
    return sb.toString();
  }

  public void serializeHelper(TreeNode root, StringBuilder sb){
    if(root==null){
      sb.append("#,");
      return;
    }
    sb.append(root.val);
    
  }
}