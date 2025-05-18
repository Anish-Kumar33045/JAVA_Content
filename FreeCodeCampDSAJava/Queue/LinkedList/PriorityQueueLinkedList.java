

public class PriorityQueueLinkedList {

   public class Node {
    int data;
    int priority;
    Node next;

    Node(int data, int priority) {
        this.data = data;
        this.priority = priority;
        this.next = null;
    }
}
    Node front;

    // Enqueue in order of priority (higher priority first, FIFO within same priority)
    public void enqueue(int data, int priority) {
        Node newNode = new Node(data, priority);

        // If queue is empty or new node has higher priority than front
        if (front == null || priority > front.priority) {
            newNode.next = front;
            front = newNode;
        } else {
            Node current = front;

            // Traverse to find correct position (preserving FIFO for same priority)
            while (current.next != null && current.next.priority >= priority) {
                current = current.next;
            }

            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }

        int value = front.data;
        front = front.next;
        return value;
    }

    public void display() {
        Node temp = front;
        System.out.print("Queue: ");
        while (temp != null) {
            System.out.print("(" + temp.data + ", P=" + temp.priority + ") ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PriorityQueueLinkedList pq = new PriorityQueueLinkedList();

        pq.enqueue(40, 2);
        pq.enqueue(10, 1);
        pq.enqueue(20, 2);
        pq.enqueue(50, 3);

        pq.display(); // (50,P=3) (40,P=2) (20,P=2) (10,P=1)

        System.out.println("Dequeued: " + pq.dequeue()); // 50
        pq.display(); // (40,P=2) (20,P=2) (10,P=1)

        System.out.println("Dequeued: " + pq.dequeue()); // 40
        pq.display(); // (20,P=2) (10,P=1)
    }
}
