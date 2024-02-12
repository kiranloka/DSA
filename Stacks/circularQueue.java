import java.util.Stack;

class CircularQueue{
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
    private int capacity;
    private int front;
    private int rear;

    CircularQueue(int k){
        capacity=k;
        stack1=new Stack<>();
        stack2=new Stack<>();
        front=-1;
        rear=-1;
    }

    public boolean enQueue(int value){
        if(isFull()){
            return false;
        }
        if(isEmpty()){
            front = value;
        }
        rear = value;
        stack1.push(value);
        return true;
    }
    public boolean deQueue(){
        if(isEmpty()){
            return false;
        }
        while(!stack1.empty()){
            stack2.push(stack1.pop());
        }
        stack2.pop();
        if(!stack2.isEmpty()){
            front=stack2.peek();//update the front element
        }else{
            front=-1;
            rear=-1;
        }
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return true;

    }

    public int front(){
        return front;
    }

    public int Rear(){
        return rear;
    }

    public boolean isEmpty(){
        return stack1.isEmpty();
    }
    public boolean isFull(){
        return stack1.size()==capacity;
    }
}

public class circularQueue {
    public static void main(String[] args) {
        CircularQueue CircularQueue = new CircularQueue(3);
        System.out.println(CircularQueue.enQueue(1)); // return true
        System.out.println(CircularQueue.enQueue(2)); // return true
        System.out.println(CircularQueue.enQueue(3)); // return true
        System.out.println(CircularQueue.enQueue(4)); // return false, the queue is full
        System.out.println(CircularQueue.Rear());     // return 3
        System.out.println(CircularQueue.isFull());   // return true
        System.out.println(CircularQueue.deQueue());  // return true
        System.out.println(CircularQueue.enQueue(4)); // return true
        System.out.println(CircularQueue.Rear());
    }
    
}
