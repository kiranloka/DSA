class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }

}

class LinkList{
    private   Node head;
    LinkList(){
        this.head=null;
    }

    public void append(int data){
        Node newNode=new Node(data);
        
        if(head==null){
            head=newNode;
            return;
        }
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }

    public void display(){
        Node currentNode=head;
        while(currentNode!=null){
            System.out.print(currentNode+"->");
            currentNode=currentNode.next;
        }
        System.out.println("null");
    }
    public void removeDuplicates(){
        Node current=head;

        while(current!=null && current.next!=null){
            if(current.data==current.next.data){
                current.next=current.next.next;
                //skip the duplicate element
            }else{
                current=current.next;
            }
        }
    }
}


public class unsortedDuplicates{
    public static void main(String[] args) {
        
    }
}