import java.util.LinkedList;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class LinkList{
    public Node head;

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
        Node current = head;

        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }
}




public class mergeLinkList{
    public static LinkList mergelist(LinkList l1,LinkList l2){
        LinkList mergelist=new LinkList();
        Node current1=l1.head;
        Node current2=l2.head;

        while(current1!=null && current2!=null){
            if(current1.data<current2.data){
                mergelist.append
                (current1.data);
                current1=current1.next;
            }
            else{
                mergelist.append(current2.data);
                current2=current2.next;
            }
        }

        if(current1 != null){
            mergelist.append(current1.data);
            current1=current1.next;
        }
        if(current2 != null){
            mergelist.append(current2.data);
            current2=current2.next;
        }
        return mergelist;

    }
    public static void main(String[] args) {
         // Create two sorted linked lists
        LinkList list1 = new LinkList();
        list1.append(1);
        list1.append(3);
        list1.append(5);

        LinkList list2 = new LinkList();
        list2.append(2);
        list2.append(4);
        list2.append(6);

        // Merge the two lists
        LinkList mergedList = mergelist(list1, list2);

        // Display the merged list
        System.out.println("Merged sorted list:");
        mergedList.display();
        
    }
}