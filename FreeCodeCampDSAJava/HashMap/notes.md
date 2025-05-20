#  HashMap in Java

## 🔹 1. Basics of HashMap

### What is a HashMap?
A `HashMap` is a part of the Java Collections Framework and implements the `Map` interface. It stores key-value pairs and allows for efficient retrieval, insertion, and deletion of elements.

`Retrieval means getting or accessing data from a storage location, data structure, or system.`

### Key-Value Pair Storage
`HashMap` stores data in the form of key-value pairs, where each key is unique, and each key maps to exactly one value.

### When to Use HashMap
Use `HashMap` when:
- You need fast lookups, insertions, and deletions.
- You do not require thread safety.
- You can tolerate unordered elements.



## Comparison of HashMap, Hashtable, LinkedHashMap, and TreeMap

| Feature         | HashMap                                      | Hashtable                                  | LinkedHashMap                                      | TreeMap                                      |
|-----------------|----------------------------------------------|--------------------------------------------|----------------------------------------------------|----------------------------------------------|
| Synchronization | Not synchronized (not thread-safe)           | Synchronized (thread-safe)                 | Not synchronized (not thread-safe)                 | Not synchronized (not thread-safe)           |
| Null Keys/Values| Allows one null key and multiple null values | Does not allow null keys or values         | Allows one null key and multiple null values       | Does not allow null keys or values           |
| Iteration Order | No guaranteed order                          | No guaranteed order                        | Maintains insertion order                          | Sorted order based on keys                   |
| Performance     | Generally faster due to lack of synchronization | Slower due to synchronization overhead | Slightly slower than HashMap due to maintaining order | Slower due to tree structure              |

## Internal Working of hashMap

### 🔸 1. Basic Structure

<pre>
Map<Key, Value> map = new HashMap<>();
</pre>

Internally, HashMap maintains an array of Node<K, V> (also called buckets).

Each Node stores:

- key

- value

- hash (computed from the key)

- next (reference to the next node, forming a linked list in case of collisions)

<pre>
static class Node<K,V> implements Map.Entry<K,V> {
    final int hash;
    final K key;
    V value;
    Node<K,V> next;
}
</pre>

### 🔸 2. How put(key, value) Works

- map.put("abc", 123);
- Hash Calculation:
   - It calculates a hash code using:


      - int hash = hash(key); // Uses hashCode() and some internal mixing
- Index Calculation:

    - index = (n - 1) & hash; // n = length of table (must be power of 2)

- Bucket Check:

  - If the bucket is empty, the key-value node is added directly.

  - If not empty (collision), it:

  - Checks for key equality (using equals())

  - If found → update value

  - If not found → append the new node at the end (linked list or tree)

- Tree Conversion (Java 8+):

   - If the number of nodes in a bucket exceeds 8, and the bucket's size is more than 64, the linked list becomes a Red-Black Tree for faster lookup.

### 🔸 3. How get(key) Works

 - map.get("abc");

 - Hash the Key → Calculate index

 - Go to the bucket at index

 - Traverse the bucket:

   - If it's a linked list → traverse each node and compare keys

   - If it's a tree → use tree search

### 🔸 4. Resize (Rehashing)
 - If the load factor (default 0.75) is exceeded:

 - The table size is doubled (capacity × 2)

 - All existing entries are rehashed and redistributed


## How Collisions Are Handled in HashMap

- When two keys generate the same hash index (bucket index), a collision occurs.

- HashMap handles collisions mainly in two ways:

  - Chaining with Linked List (before Java 8 or if bucket size < 8):
All entries with the same index are stored in a linked list at that bucket.

  - Balanced Tree (Red-Black Tree) (Java 8+ and when linked list size > 8):
When a bucket's linked list becomes too long (over 8), it converts into a balanced tree to speed up searches.


`note` 
> - HashMap keys and values can't be primitive types → Use wrapper classes or reference types.
> 
> - Valid key conditions:
> 
> - Must override hashCode() and equals()
> 
> - Must be immutable to ensure consistent hashing and equality
> 
> - Best key choice: Immutable custom object with proper hashCode() and equals() methods.
> 
> - Allowed value types:
> 
>    - Wrapper classes
> 
>    - Custom objects
> 
>    - Arrays
> 
>    - null
> 
>    - Arrays cannot be used as keys → They don't override hashCode() and equals() correctly.


## Java HashMap Constructors

1. ` HashMap()`
 - Creates an empty HashMap with:

 - default initial capacity = 16

 - default load factor = 0.75

 - Good when you don't know how many entries will be stored initially.

2. `HashMap(int initialCapacity)`
 - Creates an empty HashMap with:

 - Specified initial capacity

 - Default load factor = 0.75

 - Use this to avoid rehashing if you know the approximate number of entries.

3. `HashMap(int initialCapacity, float loadFactor)`
 - Creates an empty HashMap with:

 - Specified initial capacity

 - Specified load factor

 - Use when you want full control over performance:

   - Initial capacity: controls the number of buckets

   - Load factor: controls when rehashing happens (default is 0.75)

4. `HashMap(Map<? extends K, ? extends V> map)`
 - Creates a new HashMap and copies all mappings from the given map.

 - Useful for:

   - Cloning another map

   - Converting one map type to HashMap


## Iteration Techniques
in HashMaps.java 


##  Custom Key Objects in HashMap


### ✅ Must Override:
**equals()**: defines logical equality between two objects

**hashCode()**: returns an integer hash used to find the bucket

### 🔍 Why Proper Implementation Is Crucial:
HashMap uses hashCode() to find the bucket
  -  If the hash code is wrong or inconsistent, the key might go to the wrong bucket or never be found again.

- Within the bucket, it uses equals() to check key equality
  -  If equals() is not overridden, it falls back to reference comparison (==), causing lookup failures.

- Without proper implementation, operations like get(), containsKey(), or even put() may not work as expected.

- Changing the state of a mutable key after insertion can break the map
  -  Always make key objects immutable.

#### ✅ Good Practice:
  - Always override both equals() and hashCode() together.

  - Make key fields final to keep them immutable.



## Collision and Performance
### 🔹 What is a Collision?
 - A collision occurs when two different keys produce the same hash code and are placed in the same bucket.

### 🔹 How HashMap Handles Collisions

#### ✅ Chaining (used in HashMap)
 - Each bucket stores a linked list (or tree in Java 8+) of entries.

 - Multiple entries in the same bucket are chained together.

#### ❌ Open Addressing (not used in HashMap)
 - All entries are stored in the array.

 - If a collision happens, it looks for the next available slot.

#### 🔹 Treeification of Buckets (Java 8+)
 - If a single bucket has more than 8 entries, and the total map size is ≥ 64,
 - the linked list is converted to a balanced tree (Red-Black Tree).

 - Improves lookup time from O(n) to O(log n) in worst-case buckets.

#### 🔹 Performance Factors
 📌 Load Factor
       Default = 0.75

 - It’s the ratio of size / capacity.

 - When exceeded, HashMap resizes (rehashing happens).

 - Lower load factor = fewer collisions, more space used

 - Higher load factor = more collisions, slower performance

📌 Collisions
 - More collisions = longer chains/trees = slower lookups and inserts

## Fail-Fast Behavior in HashMap

### 🔹 What is Fail-Fast?
Fail-Fast is a runtime behavior of Java collections (like HashMap, ArrayList, etc.) where:

 - If a collection is structurally modified after creating an iterator (except through the iterator itself),

 - The program throws ConcurrentModificationException immediately during iteration.

### 🔹 What is a Structural Modification?
 - A structural modification is any operation that changes the size of the collection.

 - Examples in HashMap:

   - put() → adds a new key-value pair

   - remove() → removes an entry

   - clear() → removes all entries

Changing the value for an existing key (i.e., put() with same key) is NOT structural, and won’t trigger the exception.

### 🔹 Why Does Fail-Fast Happen? (Internal Working)
=> Java collections like HashMap use an internal variable called modCount:

 - It tracks the number of structural modifications made to the map.

 - When an iterator is created, it stores the current modCount as expectedModCount.

 - On each call to next() or hasNext(), the iterator checks:

   - If modCount != expectedModCount

   - If they differ, it means the collection has been modified outside the iterator →
Throws ConcurrentModificationException


### 🔹 Example (Code That Fails):

```java
Map<String, String> map = new HashMap<>();
map.put("A", "Apple");
map.put("B", "Banana");

for (String key : map.keySet()) {
    map.remove(key);  // ❌ Structural modification outside iterator → throws exception
}
Output:
Exception in thread "main" java.util.ConcurrentModificationException
```

### 🔹 How to Avoid Fail-Fast Behavior
✅ 1. Use Iterator's remove() method:
It is the only safe way to remove elements during iteration.

```java
Iterator<String> it = map.keySet().iterator();
while (it.hasNext()) {
    String key = it.next();
    it.remove();  // ✅ Safe removal through iterator
}

```

✅ 2. Use ConcurrentHashMap:
If multiple threads or modifications are expected, use ConcurrentHashMap.
It is not fail-fast, and handles concurrent modifications safely.

### 🔹 Fail-Fast is Not Fail-Safe
- Fail-Fast: Immediately throws an error when a problem is detected (like HashMap, ArrayList).

- Fail-Safe: Works on a clone of the collection and does not throw exceptions (like ConcurrentHashMap, CopyOnWriteArrayList).


## Thread Safety in Java Maps

| Feature          | **HashMap**                              | **Hashtable**                           | **ConcurrentHashMap**                                 |
| ---------------- | ---------------------------------------- | --------------------------------------- | ----------------------------------------------------- |
| Thread Safety    | ❌ Not thread-safe                        | ✅ Thread-safe                           | ✅ Thread-safe                                         |
| Performance      | Fast in single-threaded apps             | Slower due to full method-level locking | Better performance with fine-grained locking          |
| Null Keys/Values | Allows 1 null key & multiple null values | ❌ No null keys or values                | ❌ No null keys, allows null values (in some versions) |
| Synchronization  | Not synchronized                         | All methods synchronized                | Uses segment-level or bucket-level locking            |
| Introduced In    | Java 1.2                                 | Java 1.0                                | Java 1.5                                              |

### 🔹 Why HashMap is Not Thread-Safe
- Multiple threads modifying a HashMap simultaneously (e.g., putting or removing keys) may lead to:

- Data inconsistency

- Infinite loops

- Corrupted internal structure (e.g., missing keys or values)

- Unexpected null entries

- HashMap has no built-in synchronization. It is designed for single-threaded environments.

### 🔹 How to Make HashMap Thread-Safe

#### ✅ Approach 1: Use Collections.synchronizedMap()
Wraps the HashMap with a synchronized version.

<pre>
Map<String, String> syncMap = Collections.synchronizedMap(new HashMap<>());
</pre>

  All operations are now synchronized.
  However, you must manually synchronize blocks when iterating.

``` java
synchronized (syncMap) {
    for (Map.Entry<String, String> entry : syncMap.entrySet()) {
        // safe iteration
    }
}
```

#### ✅ Approach 2: Use ConcurrentHashMap
Built-in thread-safe version of HashMap.

Uses fine-grained locking (lock per bucket).

Better performance under multi-threading.

```java
ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
map.put("key", "value");

```

## Time Complexity of HashMap Operations

### 🔹 Average Case Time Complexity
- get(key) — O(1)
  - Accessing a value by key is generally constant time because the hash code directs to a bucket and entries in that bucket are usually few.

- put(key, value) — O(1)
  - Inserting a key-value pair is usually constant time by hashing to the correct bucket and adding the entry.

- remove(key) — O(1)
  - Removing an entry by key typically takes constant time by locating the bucket and removing the entry.

### 🔹 Worst Case Time Complexity

- get(key) — O(n)
  - Happens when all keys collide into the same bucket (hash collision), turning that bucket into a linked list (or tree).
  - In the worst case (before Java 8 treeification), it may require searching through all entries.

- put(key, value) — O(n)
  - Same as get, if many keys collide and form a long chain, insertion time increases.

- remove(key) — O(n)
  - Removing from a long collision chain requires searching through that chain.

### 🔹 Java 8+ Improvement: Treeification
 - When a bucket’s chain size exceeds 8 and total map size is at least 64, the bucket is converted to a Red-Black Tree.

 - This changes the worst-case complexity for get(), put(), and remove() to O(log n) instead of O(n).

#### ✅ Summary Table

| Operation  | Average Case | Worst Case (Java 7) | Worst Case (Java 8+) |
| ---------- | ------------ | ------------------- | -------------------- |
| `get()`    | O(1)         | O(n)                | O(log n)             |
| `put()`    | O(1)         | O(n)                | O(log n)             |
| `remove()` | O(1)         | O(n)                | O(log n)             |
