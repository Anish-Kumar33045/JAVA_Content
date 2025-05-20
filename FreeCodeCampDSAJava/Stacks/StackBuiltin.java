
import java.util.Stack;

public class StackBuiltin {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        push(stack, 10);
        push(stack, 20);
        push(stack, 30);

        // Display the stack
        display(stack);

        // Peek at the top element
        peek(stack);

        // Pop an element
        pop(stack);

        // Display after pop
        display(stack);
    }

    // Push operation
    public static void push(Stack<Integer> stack, int value) {
        stack.push(value);
        System.out.println("Pushed: " + value);
    }

    // Pop operation
    public static void pop(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int removed = stack.pop();
            System.out.println("Popped: " + removed);
        } else {
            System.out.println("Stack is empty, cannot pop");
        }
    }

    // Peek operation
    public static void peek(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int top = stack.peek();
            System.out.println("Peeked: " + top);
        } else {
            System.out.println("Stack is empty, nothing to peek");
        }
    }

    // Display operation
    public static void display(Stack<Integer> stack) {
        System.out.println("Stack: " + stack);
    }
}
