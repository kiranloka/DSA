
import java.util.Stack;


public class queueStack {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public queueStack(){
        stack1=new Stack<>();
        stack2=new Stack<>();
    }

    public void enqueue(int data){
        stack1.push(data);
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("The stack is empty!");
            return -1;
        }
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("The stack is Empty!");
            return -1;
        }
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }

        return stack2.peek();
    }

    public boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }
    public static void main(String[] args) {

        queueStack queue = new queueStack();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Dequeued item: " + queue.dequeue());
        System.out.println("Peeked item: " + queue.peek());
        
    }
    
}
