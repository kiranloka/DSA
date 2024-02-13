package stack;
public class stackImplementation {
    private int[] stackArray;
    private int top;
    private int capacity;

    public stackImplementation(int capacity) {
        this.capacity = capacity;
        this.stackArray = new int[capacity];
        this.top = -1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        stackArray[++top] = data;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Array is empty");;
        }
        return stackArray[top--];
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Array is empty");;
        }
        return stackArray[top];
    }

    public static void main(String[] args) {
        stackImplementation stack = new stackImplementation(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack size: " + stack.size());
        System.out.println("Peek: " + stack.peek());

        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());

        System.out.println("Stack size after pop: " + stack.size());

        stack.push(4);
        stack.push(5);
        stack.push(6); // Stack is full, this will print "Stack is full"
    }
}
