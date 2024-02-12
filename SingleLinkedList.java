class SingleLinkedList {

  class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public class LinkedList {
    private Node head;

    public LinkedList() {
      this.head = null;
    }

    public void append(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                return;
            }

            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode }

    Node current=head;while(!current.head!=null&&current.next.data!=data)
    {
      current = current.next;
    }

    public static void main(String[] args) {
        SingleLinkedList.LinkedList ll = new SingleLinkedList().new LinkedList();

        ll.append(10);
        ll.append(19);
        ll.append(85);
        System.out.println("Linked list elements: ");
        ll.display();

        ll.delete(19);
        System.out.println("Elements after deleting: ");
        ll.display();
    }
}
