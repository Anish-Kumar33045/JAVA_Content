
import java.util.Scanner;

public class LinkedListDeque {

    class Node {

        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            this.prev = this.next = null;
        }
    }

    Node front, rear;

    LinkedListDeque() {
        front = rear = null;
    }

    boolean isEmpty() {
        return front == null;
    }

    void insertFront(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
    }

    void insertRear(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
    }

    void deleteFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }

        if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
            front.prev = null;
        }
    }

    void deleteRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }

        if (front == rear) {
            front = rear = null;
        } else {
            rear = rear.prev;
            rear.next = null;
        }
    }

    int getFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return -1;
        }
        return front.data;
    }

    int getRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return -1;
        }
        return rear.data;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }

        Node temp = front;
        System.out.print("Deque elements: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListDeque deque = new LinkedListDeque();

        while (true) {
            System.out.println("\n1. Insert Front");
            System.out.println("2. Insert Rear");
            System.out.println("3. Delete Front");
            System.out.println("4. Delete Rear");
            System.out.println("5. Display");
            System.out.println("6. Get Front");
            System.out.println("7. Get Rear");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter value: ");
                    deque.insertFront(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter value: ");
                    deque.insertRear(sc.nextInt());
                    break;
                case 3:
                    deque.deleteFront();
                    break;
                case 4:
                    deque.deleteRear();
                    break;
                case 5:
                    deque.display();
                    break;
                case 6:
                    System.out.println("Front element: " + deque.getFront());
                    break;
                case 7:
                    System.out.println("Rear element: " + deque.getRear());
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
