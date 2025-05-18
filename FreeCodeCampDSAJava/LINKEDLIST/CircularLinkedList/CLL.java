import java.util.NoSuchElementException;
import java.util.Scanner;

public class CLL {

    private ListNode last;
    private int length;

    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) { // constructor takes value of data 
            this.data = data;
        }
    }

    public CLL() {
        last = null;
        length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int length() {
        return length;
    }

    public void display() {
        if (last == null) {
            return;
        }
        ListNode temp = last.next;
        while (temp != last) {
            System.out.printf("%d => ", temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data + " ");
    }

    public void insertFront(int value) {
        ListNode newNode = new ListNode(value);
        if (last == null) {
            last = newNode;
        } else {
            newNode.next = last.next;
        }
        last.next = newNode;
        length++;
    }

    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if (last == null) {
            last = newNode;
            last.next = newNode;
        } else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public ListNode deleteFront() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        ListNode temp = last.next;
        if (last.next == last) {
            last = null;
        } else {
            last.next = temp.next;
        }
        temp.next = null;
        length--;
        return temp;
    }

    
    public ListNode deleteLast() {
    if (isEmpty()) {
        throw new NoSuchElementException();
    }

    ListNode temp = last;

    // If there's only one node
    if (last.next == last) {
        last = null;
    } else {
        ListNode current = last.next; // Start from first
        // Traverse until the node before last
        while (current.next != last) {
            current = current.next;
        }
        current.next = last.next; // Point to first
        last = current; // Update last
    }

    temp.next = null;
    length--;
    return temp;
}


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CLL cll = new CLL();
        int choice, value;

        System.out.println("Circular linked list operations");

        while (true) {
            System.out.println("\nCCL operations:");
            System.out.println("1. InsertFront\n2. InsertRear\n3. DeleteFront\n4. DeleteRear\n5. Display\n6. Exit");
            System.out.print("Enter your choice: ");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value: ");
                    value = in.nextInt();
                    cll.insertFront(value);
                    break;
                case 2:
                    System.out.print("Enter the value: ");
                    value = in.nextInt();
                    cll.insertLast(value);
                    break;
                case 3:
                    System.out.println("Element deleted: " + cll.deleteFront().data);
                    break;
                case 4:
                    System.out.println("Element deleted: " + cll.deleteLast().data);
                    break;
                case 5:
                    cll.display();
                    break;
                case 6:
                    in.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
