import java.util.Stack;

class MinStack{
    Stack<Integer> stack;
    Stack<Integer> minStack;

    MinStack(){
        stack=new Stack<>();
        minStack=new Stack<>();
    }


    public void push(int data){
        stack.push(data);
        if(minStack.isEmpty() || data<minStack.peek()){
            minStack.push(data);
        }
    }

    public void pop(){
        int popped=stack.pop();
        if(popped==minStack.peek()){
            minStack.pop();
        }
    }

    public int top(){
        if(!stack.isEmpty()){
            return stack.peek();
        }
        return -1;
    }

    public int minTerm(){
        if(!minStack.isEmpty()){
            return minStack.peek();
        }
        return -1;
    }
}
public class minStackDS{
    

    
    public static void main(String[] args){
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.minTerm()); // Output: -3
        minStack.pop();
        System.out.println(minStack.top());    // Output: 0
        System.out.println(minStack.minTerm()); 
    }    
}
