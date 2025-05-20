# What is Java Collections Framework?

The Collections Framework in Java is a set of classes and interfaces that implement commonly reusable data structures like List, Set, Queue, Map, etc.
It is part of the java.util package.

**_ Hierarchy of Java Collections _**

                    Collection (Interface)
                   /       |       \
                 List     Set     Queue   <-- Interfaces
                  |        |        |
            ArrayList   HashSet  LinkedList
            LinkedList  TreeSet  PriorityQueue
            Vector

              Map (Interface)
               |
            HashMap
            TreeMap
            LinkedHashMap


       Map is not part of Collection, but is included in the framework.

## 🔹 Interfaces and Their Implementations
### 1. List Interface
* Ordered collection
* Allows duplicates
* Accessed via index 
* This list interface is implemented by various classes like ArrayList, Vector, Stack, etc. Since all the subclasses implement the list, we can instantiate a list object with any of these classes.

For example:
<pre>
List <T> al = new ArrayList<> ();
List <T> ll = new LinkedList<> ();
List <T> v = new Vector<> ();
Where T is the type of the object
</pre>
### 🔸 Implementations:
* ArrayList - Resizable array , slower than normal arrays , but flexible

* LinkedList - Doubly linked list implementation

* Vector - (Thread-safe)
  - provides us with dynamic arrays in Java

  - it may be slower than standard arrays

  - helpful in programs where lots of manipulation in the array is needed.

  - primary difference between a vector and an ArrayList is that a Vector is synchronized and an ArrayList is non-synchronized.

* Stack - implements the Stack data structure. last-in-first-out.
functions - basic push and pop , empty, search, and peek.
The Stack class can also be referred to as the subclass of Vector.

### ✅ 2. SET INTERFACE
No duplicates allowed
Unordered (except TreeSet)

🔸 Implementations:

1. HashSet - Unordered set
2. LinkedHashSet - Maintains insertion order
3. TreeSet - Sorted set (natural ordering)
