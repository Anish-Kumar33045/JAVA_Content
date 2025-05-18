
public class QueueCircular {

    private int[] queue;
    private int front, rear, size, capacity;

    public QueueCircular(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue operation
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = data;
        size++;
    }

    // Dequeue operation
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int removed = queue[front];
        front = (front + 1) % capacity;
        size--;
        return removed;
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    // Check if full
    public boolean isFull() {
        return size == capacity;
    }

    // Check if empty
    public boolean isEmpty() {
        return size == 0;      //front = 0 && rear =-1  
    }

    /*

🟨 But if you don't use size, then the conditions look like:
      🔸 Full:
               (rear + 1) % capacity == front

      🔸 Empty:
                front == -1
       (Or use: front == rear == -1 at initialization)

     */
    // Print queue
    public void printQueue() {
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        QueueCircular cq = new QueueCircular(5);

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);
        cq.printQueue();

        System.out.println("Dequeued: " + cq.dequeue());
        cq.printQueue();

        cq.enqueue(60); // Wrap around
        cq.printQueue();
    }
}
