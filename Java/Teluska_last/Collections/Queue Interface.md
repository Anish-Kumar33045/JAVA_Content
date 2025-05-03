# QueueInterface (FIFO)

Since all these subclasses implement the queue, we can instantiate a queue object with any of these classes.

For example:

Queue <T> pq = new PriorityQueue<> ();
Queue <T> ad = new ArrayDeque<> ();
Where T is the type of the object.

The most frequently used implementation of the queue interface is the PriorityQueue.

1. Priority Queue

- PriorityQueue is used when the objects are supposed to be processed based on priority.
- follows the FIFO , but processed acc. to the priority .
- The PriorityQueue is based on the priority heap.
- The elements of the priority queue are ordered according to the natural ordering, or by a Comparator
  provided at queue construction time, depending on which constructor is used.

# Deque Interface

- This is a very slight variation of the queue data structure.
- Deque, also known as a double-ended queue, is a data structure where we can add and remove elements from both ends of the queue.
- This interface extends the queue interface.
- The class which implements this interface is ArrayDeque.

- Since ArrayDeque class implements the Deque interface, we can instantiate a deque object with this class.
  For example:

Deque<T> ad = new ArrayDeque<> ();
Where T is the type of the object.

1. ArrayDeque

- ArrayDeque class provides resizable array.
- This can grow and allow users to add or remove an element from both sides of the queue.
- Array deques have no capacity restrictions and they grow as necessary to support usage.
