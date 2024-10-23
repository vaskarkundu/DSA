import java.util.Stack;  // Import the Stack class

public class MIn_Stack {
    private Stack<Integer> stack;      // Stack to hold the actual values
    private Stack<Integer> minStack;   // Stack to hold the minimum values

    public MIn_Stack() {
        stack = new Stack<>();          
        minStack = new Stack<>();       
    }

    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty() || minStack.peek() > val){
            minStack.push(val);
        }
        // Implement the logic to push a value onto the stack
    }

    public void pop() {
        int poppedValue = stack.pop();
    
    
    if (poppedValue == minStack.peek()) {
        minStack.pop();
    }
    }

    public int top() {
        // Implement the logic to return the top element of the stack
        return stack.peek();  // Placeholder return
    }

    public int getMin() {
        // Implement the logic to return the minimum element in the stack
        return minStack.peek();  // Placeholder return
    }
}
