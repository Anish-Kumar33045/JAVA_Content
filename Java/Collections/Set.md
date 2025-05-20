# Set

- unordered collection of objects
- duplicate values cannot be stored

- This set interface is implemented by various classes like HashSet, TreeSet, LinkedHashSet, etc. Since all the subclasses implement the set, we can instantiate a set object with any of these classes.

For example:
<pre>
Set<T> hs = new HashSet<> ();
Set<T> lhs = new LinkedHashSet<> ();
Set<T> ts = new TreeSet<> ();

Where T is the type of the object.
</pre>

### 1. HashSet
   - The HashSet class is an inherent implementation of the hash table data structure.
   - The objects that we insert into the HashSet do not guarantee to be inserted in the same order.
   - The objects are inserted based on their hashcode.
   - This class also allows the insertion of NULL elements.

### 2. LinkedHashSet
   - A LinkedHashSet is very similar to a HashSet.
   this uses a doubly linked list to store the data and retains the ordering of the elements.

## Sorted Set Interface

- This interface is very similar to the set interface.
- this interface has extra methods that maintain the ordering of the elements.

- Since this class implements the SortedSet, we can instantiate a SortedSet object with this class.
For example:

SortedSet<T> ts = new TreeSet<> ();
Where T is the type of the object.

- The class which implements the sorted set interface is TreeSet.

### 1.  TreeSet
    - TreeSet stores elements in a sorted (ascending) order.

- It uses a Tree structure (specifically, a Red-Black Tree).

- By default, it sorts elements using their natural order (like numbers or strings).

- You can also give a custom comparator to define your own sorting.

- Duplicates are not allowed.
