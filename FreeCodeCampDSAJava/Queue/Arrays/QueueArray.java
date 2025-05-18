
public class QueueArray {

    int[] queue;
    int front = 0, rear = -1, size = 0, capacity;

    public QueueArray(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
    }

    public boolean isFull() {
        return rear == capacity - 1;
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue Full");
            return;
        }
        queue[++rear] = data;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Empty");
            return -1;
        }
        size--;
        return queue[front++];
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println(q.dequeue());
    }
}
