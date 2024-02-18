pubic
class streizeAndDesterilize {
  public static String serialize(Node node) {
    if (root == null) {
      return null;

    }
    StringBuilder sb = new StringBuilder();
    preOrderSerialize(root, sb);
    return sb.toString();

  }

  private static void preOrderSerialize(Node node, StringBuilder sb) {
    if (node == null) {
      sb.append("null");

    } else {
      sb.append(node.data + " ");
      preorderSerialize(node.left, sb);
      preorderSerialize(node.right, sb);
    }
  }}

Class Node{
  int data;
  Node left;
  Node right;

  public Node(int item){
    this.data=item;
    left=right=null;

}
