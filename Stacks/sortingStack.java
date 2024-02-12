import java.util.Stack;

public class sortingStack{
  
  public static void sortStack(Stack<Integer> stack){
    Stack<Integer> tempStack=new Stack<>();


    while(!stack.isEmpty()){
      int temp=stack.pop();

      while(!tempStack.isEmpty() && tempStack.peek()>temp){
        stack.push(tempStack.pop());
      }

      tempStack.push(temp); 

    }

    while(!tempStack.isEmpty()){
      stack.push(tempStack.pop());
    }
  }

  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    stack.push(4);
    stack.push(1);
    stack.push(3);
    stack.push(2);
    stack.push(5);

    System.out.println("Stack before sorting: " + stack);

    sortStack(stack);

    System.out.println("Stack after sorting: " + stack);
}
  
}
