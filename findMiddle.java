class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class LinkedList{
    private Node head;
    public LinkedList(){
        this.head=null;
    }    

    public void append(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node current = head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }

    public Node Middle(){
        if(head==null){
            return null;
        }

        Node slowPointer=head;
        Node fastPointer=head;

        while(fastPointer!=null && fastPointer.next!=null){
            slowPointer=slowPointer.next;
            fastPointer=fastPointer.next.next;
        }

        return slowPointer;
    }
}


public class findMiddle {
    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();


        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        Node middleNode = linkedList.Middle();

        if (middleNode != null) {
            System.out.println("Middle of the linked list: " + middleNode.data);
        } else {
            System.out.println("Linked list is empty.");
        }
    

    
}
}
    

