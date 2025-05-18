/*
✅ What is a Monotonic Stack?
A Monotonic Increasing Stack keeps elements in increasing order (top is the smallest).

A Monotonic Decreasing Stack keeps elements in decreasing order (top is the largest).

These are useful in problems like Next Greater Element, Largest Rectangle in Histogram, Stock Span, etc.
 */
import java.util.Stack;

public class MonotonicStack {

    // Function to build monotonic increasing stack
    public static Stack<Integer> buildIncreasingStack(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int num : arr) {
            while (!stack.isEmpty() && stack.peek() > num) {
                stack.pop();
            }
            stack.push(num);
        }
        return stack;
    }

    // Function to build monotonic decreasing stack
    public static Stack<Integer> buildDecreasingStack(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int num : arr) {
            while (!stack.isEmpty() && stack.peek() < num) {
                stack.pop();
            }
            stack.push(num);
        }
        return stack;
    }

    // Main function to test both stacks
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 6};

        Stack<Integer> incStack = buildIncreasingStack(arr);
        System.out.println("Monotonic Increasing Stack: " + incStack);

        Stack<Integer> decStack = buildDecreasingStack(arr);
        System.out.println("Monotonic Decreasing Stack: " + decStack);
    }
}
