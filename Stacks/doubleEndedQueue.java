import java.util.Stack;

public class doubleEndedQueue {
    private Stack<Integer> frontEnd;
    private Stack<Integer> rearEnd;
    public doubleEndedQueue(){
        frontEnd=new Stack<>();
        rearEnd=new Stack<>();
    }

    public void addToFront(int data){
        frontEnd.push(data);
    }
    public void addToRear(int data){
        addToRear(data);
    }
    public int removeFromFront(){
        if(isEmpty()){
            throw new IllegalStateException("Stack is empty!");
        }
        if(frontEnd.isEmpty()){
            while(!rearEnd.isEmpty()){
                frontEnd.push(rearEnd.pop());
            }
        }
        return frontEnd.pop();

    }
    public int removeFromBack(){
        if(isEmpty()){
            throw new IllegalStateException("STack is empty!");
        }
        if(rearEnd.isEmpty()){
            while(!frontEnd.isEmpty()){
                rearEnd.push(frontEnd.pop());
            }
        }

        return rearEnd.pop();
    }
    public boolean isEmpty(){
        return frontEnd.isEmpty() && rearEnd.isEmpty();
    }

    public static void main(String[] args){
        doubleEndedQueue deque = new doubleEndedQueue();

        deque.addToFront(1);
        deque.addToFront(2);
        deque.addToRear(3);
        deque.addToRear(4);

        System.out.println("Removed from front: " + deque.removeFromFront());
        System.out.println("Removed from back: " + deque.removeFromBack());
        System.out.println("Removed from front: " + deque.removeFromFront());
        System.out.println("Removed from back: " + deque.removeFromBack());
    }
    
}
