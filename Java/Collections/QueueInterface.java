import java.util.*;

public class QueueInterface {
    public static void main(String[] args) {
         PriorityQueue<Integer> pQueue
            = new PriorityQueue<Integer>();

        // Adding items to the pQueue using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);

        // Printing the PriorityQueue
        System.out.println(pQueue);

        // Printing the top element of PriorityQueue
        System.out.println(pQueue.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pQueue.poll());

        // Printing the top element again
        System.out.println(pQueue.peek());
        /*
         🔹 Important Behavior of PriorityQueue:
             By default, Java's PriorityQueue is a min-heap.
        
         That means smallest element has the highest priority and appears first.
        
        🌟 Step-by-step:
        Steps	               Queue contents           	Output
        Add                     10, 20, 15	              [10, 20, 15]  (internally stored as min-heap)
        peek()	               10 (smallest)	              10
        poll()(removes 10)        removes 10               	  10
        peek() again	       15 is now smallest	          15
         */
        
        System.out.println("==========================");

        // Initializing an deque
        ArrayDeque<Integer> de_que
            = new ArrayDeque<Integer>(10);

        // add() method to insert
        de_que.add(10);
        de_que.add(20);
        de_que.add(30);
        de_que.add(40);
        de_que.add(50);

        System.out.println(de_que);

        // clear() method
        de_que.clear();

        // addFirst() method to insert the
        // elements at the head
        de_que.addFirst(564);
        de_que.addFirst(291);

        // addLast() method to insert the
        // elements at the tail
        de_que.addLast(24);
        de_que.addLast(14);

        System.out.println(de_que);
    }
}
