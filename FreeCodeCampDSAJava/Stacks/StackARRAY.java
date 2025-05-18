
import java.util.Scanner;

public class StackARRAY {

    private int top;
    private int arr[];

    public StackARRAY(int capacity) {
        top = -1;
        arr = new int[capacity];
    }

    public StackARRAY() {
        this(10); //this keyword is a reference variable that refers to the current object of the class.
    }

    public boolean isFull() {
        return top == arr.length - 1;
    }

    public boolean isEmp() {
        return top == -1;
    }

    public void push(int data) {
        if (isFull()) {
            throw new RuntimeException("Stack is Full !!! ");
        }
        top++;
        arr[top] = data;
        System.out.println(arr[top] + " sucessfully inserted ");
    }

    public void pop() {
        if (isEmp()) {
            throw new RuntimeException("Stack is Empty !!! ");
        }
        System.out.println(arr[top] + " sucessfully deleted ");
        top--;
    }

    public void peek() {
        if (isEmp()) {
            System.out.println(" Stack is Empty !!! ");
        }
        System.out.println("peek element : " + arr[top]);
    }

    public void display() {
        if (isEmp()) {
            throw new RuntimeException("Stack is Empty !!! ");
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackARRAY st = new StackARRAY();

        System.out.println("STACK operations");

        int choice, val;
        while (true) {
            System.out.println("Operations:\n1. PUSH\n2. POP\n3. Display\n4. Peek\n5. exit");
            System.out.print("Enter the choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value to be pushed: ");
                    val = scanner.nextInt();
                    st.push(val);
                    break; // Added missing break

                case 2:
                    st.pop();
                    break;

                case 3:
                    st.display();
                    break;
                case 4:
                    st.peek();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

}
