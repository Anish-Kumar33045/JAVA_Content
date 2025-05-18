
import java.util.Scanner;

public class ArrayDeque {

    int[] arr;
    int front, rear, size;

    public ArrayDeque(int capacity) {
        arr = new int[capacity];
        front = -1;
        rear = -1;
        size = capacity;
    }

    boolean isFull() {
        return ((front == 0 && rear == size - 1) || (rear + 1) % size == front);
    }

    boolean isEmpty() {
        return (front == -1);
    }

    void insertFront(int key) {
        if (isFull()) {
            System.out.println("Deque is full");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else if (front == 0) {
            front = size - 1;
        } else {
            front--;
        }

        arr[front] = key;
    }

    void insertRear(int key) {
        if (isFull()) {
            System.out.println("Deque is full");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % size;
        }

        arr[rear] = key;
    }

    void deleteFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }

        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
    }

    void deleteRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }

        if (front == rear) {
            front = rear = -1;
        } else if (rear == 0) {
            rear = size - 1;
        } else {
            rear--;
        }
    }

    int getFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return -1;
        }
        return arr[front];
    }

    int getRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return -1;
        }
        return arr[rear];
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }

        System.out.print("Deque elements: ");
        int i = front;
        while (true) {
            System.out.print(arr[i] + " ");
            if (i == rear) {
                break;
            }
            i = (i + 1) % size;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque deque = new ArrayDeque(5);

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
