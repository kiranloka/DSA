
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}


public class usingLinkedLists {
    
    private Node top;

    public usingLinkedLists(){
        this.top=null;
    }

    public void push(int item){
        Node newNode=new Node(item);
        newNode.next=top;
        top=newNode;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty!");
            return -1;
        }

        int item=top.data;
        top=top.next;
        return item;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("The stack is empty!");
            return -1;
        }

        return top.data;
    }

    public boolean isEmpty(){
        return  top==null;
    }
    public static void main(String[] args) {
       usingLinkedLists stack = new usingLinkedLists();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Top element is: " + stack.peek());
        System.out.println(stack.pop() + " popped from stack");
        System.out.println("Top element is: " + stack.peek());
    }
    
}
