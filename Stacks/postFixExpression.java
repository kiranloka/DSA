import java.util.Stack;

public class postFixExpression {
  public static int evaluatePostfix(String expression) {
    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < expression.length(); i++) {
      char c = expression.charAt(i);

      if (Character.isDigit(c)) {
        stack.push(c - '0');
      } else if (c != ' ') {
        int operand2 = stack.pop();
        int operand1 = stack.pop();

        switch (c) {
          case '+':
            stack.push(operand1 + operand2);
            break;

          case '-':
            stack.push(operand1 - operand2);
            break;
          case '*':
            stack.push(operand1 * operand2);
            break;
          case '/':
            stack.push(operand1 / operand2);
            break;
        }
      }

    }
    return stack.pop();
  }

  public static void main(String[] args) {
    String postFixExpression = "5 3 + 7 *";
    int result = evaluatePostfix(postFixExpression);
    System.out.println("Result of " + postFixExpression + " is: " + result);
  }
}
