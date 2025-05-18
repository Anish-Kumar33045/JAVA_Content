
class CircularQ {

    private Node rear = null;
    private Node front = null;

    class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Enqueue operation
    public void enqueue(int value) {
        Node newNode = new Node(value);

        if (front == null) {
            front = newNode;
            rear = newNode;
            rear.next = front;  // circular link
        } else {
            rear.next = newNode;
            rear = newNode;
            rear.next = front;
        }
        System.out.println(value + " enqueued");
    }

    // Dequeue operation
    public void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        if (front == rear) {
            System.out.println("Dequeued: " + front.data);
            front = null;
            rear = null;
        } else {
            System.out.println("Dequeued: " + front.data);
            front = front.next;
            rear.next = front;
        }
    }

    // Display the queue
    public void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        Node temp = front;
        System.out.print("Queue: ");
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != front);
        System.out.println();
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    public static void main(String[] args) {
        CircularQ queue = new CircularQ();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();

        queue.dequeue();
        queue.display();

        queue.enqueue(40);
        queue.display();
    }
}
