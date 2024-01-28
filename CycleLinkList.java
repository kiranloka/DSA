

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkList{
    public Node head;

    public LinkList(){
        this.head=null;
    }
    public void append(int data){
        Node newNode=new Node(data);

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

    public Boolean isCyclic(){
        Node tortoise=head;
        Node hare=head;

        while(hare!=null && hare.next!=null){
            tortoise=tortoise.next;
            hare=hare.next.next;
            if(tortoise==hare){
                return true;//found a meeting point hence cyclic
            }    
        }
        return false;
    }
    public Node getHead(){
        return head;
    }
    
}





public class CycleLinkList {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.append(1);
        linkList.append(2);
        linkList.append(3);
        linkList.append(4);
        linkList.append(5);
    
        // Creating a cycle by connecting the last node to the second node
        linkList.head.next.next.next.next.next = linkList.head.next;
    
        // Check if the linked list is cyclic
        boolean isCyclic = linkList.isCyclic();
    
        if (isCyclic) {
            System.out.println("Linked list is cyclic.");
        } else {
            System.out.println("Linked list is not cyclic.");
        }
    }
    
    }
    
