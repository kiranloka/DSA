package Stacks;

public class stackImplementation{
    
    private int[] array;
    private int top;
    private int capacity;
    
    public stackImplementation(int size){
        capacity=size;
        array=new int[size];
        top=-1;
    }

    public void push(int item){
        if(isFull()){
            System.out.println("Stack Overflow!");
            return;
        }
        array[++top]=item;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow!");
            return -1;
        }

        return array[top--];
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("The Stack is empty!");
            return -1;
        }

        return array[top];
    }

    public boolean isEmpty(){
        return top==-1;
    }
    
    public boolean isFull(){
        return top==capacity-1;
    }
    public static void main(String[] args) {
       stackImplementation stack = new stackImplementation(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Top element is: " + stack.peek());
        System.out.println(stack.pop() + " popped from stack");
        System.out.println("Top element is: " + stack.peek());
    }
}