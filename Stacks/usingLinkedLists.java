class Node{
    int data;
    Node next;


    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class Stack{
    private Node top;

    Stack(){
        this.top=null;
    }


    public void push(int data){
        Node newNode=new Node(data);

        if(isEmpty()){
            top=newNode;
        }
        else{
            newNode.next=top;
            top=newNode;
        }

        System.out.println(data+ " Pushed to stack!");
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("The given stack is empty!");
            return -1;
        }else{
            int popped=top.data;
            top=top.next;
            return popped;
        }
        
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("The given stack is empty!");
            return -1;
        }else{
            return top.data;
        }

    }

    public boolean isEmpty(){
        return top==null;

        
    }
}



public class usingLinkedLists{
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is " + stack.peek());

        System.out.println(stack.pop() + " popped from stack");
        System.out.println(stack.pop() + " popped from stack");

        System.out.println("Top element is " + stack.peek());
    }
}