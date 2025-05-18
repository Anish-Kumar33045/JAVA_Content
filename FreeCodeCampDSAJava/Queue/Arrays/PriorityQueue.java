
/*
Data:     [ 40, 10, 20, 50 ]
Priority: [  2,  1,  2,  3 ]
First dequeue() → removes 50 (priority 3)

Next dequeue() → removes 40 (priority 2, came before 20)

Next → removes 20 

Then → 10 

 */
public class PriorityQueue {

    int[] data;
    int[] priority;
    int size;
    int capacity;

    public PriorityQueue(int capacity) {
        this.capacity = capacity;
        data = new int[capacity];
        priority = new int[capacity];
        size = 0;
    }

    // Enqueue with priority
    public void enqueue(int value, int prio) {
        if (size == capacity) {
            System.out.println("Queue is full");
            return;
        }
        data[size] = value;
        priority[size] = prio;
        size++;
    }

    // Dequeue based on highest priority, FIFO if tie
    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }

        int maxPrioIndex = 0;
        for (int i = 1; i < size; i++) {
            if (priority[i] > priority[maxPrioIndex]) {
                maxPrioIndex = i;
            }
        }

        int removedValue = data[maxPrioIndex];

        // Shift data and priority arrays
        for (int i = maxPrioIndex; i < size - 1; i++) {
            data[i] = data[i + 1];
            priority[i] = priority[i + 1];
        }

        size--;
        return removedValue;
    }

    public void display() {
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print("(" + data[i] + ", P=" + priority[i] + ") ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue(10);
        pq.enqueue(40, 2);
        pq.enqueue(10, 1);
        pq.enqueue(20, 2);
        pq.enqueue(50, 3);

        pq.display();               // (40,P=2) (10,P=1) (20,P=2) (50,P=3)

        System.out.println(pq.dequeue());  // 50
        pq.display();               // (40,P=2) (10,P=1) (20,P=2)

        System.out.println(pq.dequeue());  // 40 (priority 2, came before 20)
        pq.display();               // (10,P=1) (20,P=2)
    }
}
