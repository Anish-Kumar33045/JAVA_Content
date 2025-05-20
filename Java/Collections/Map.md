# Java Maps and Their Types: HashMap, TreeMap, LinkedHashMap

## Introduction to Map in Java

* A **Map** is an object that maps **keys to values**.
* A map **cannot contain duplicate keys**.
* Each key can map to **at most one value**.
* Defined in the `java.util` package.
* `Map` is an interface. Commonly used implementations are:

  * `HashMap`
  * `TreeMap`
  * `LinkedHashMap`

## Key Characteristics of Map

* Key-value pair storage
* Unique keys
* Allows null keys and null values (depends on implementation)
* Not a subtype of `Collection`

---

## 1. HashMap

### Overview:

* Implements the `Map` interface.
* Stores data using a **hashing** mechanism.
* **No guarantee** of order (neither insertion nor sorted).
* Allows **one null key** and **multiple null values**.

### Syntax:

```java
Map<KeyType, ValueType> map = new HashMap<>();
```

### Characteristics:

* Time complexity for **get()** and **put()** is **O(1)** in average case.
* Fastest among all map implementations.
* Backed by an array of buckets (hash table).
* Uses `equals()` and `hashCode()` for comparison.

### Example:

```java
Map<Integer, String> map = new HashMap<>();
map.put(1, "One");
map.put(2, "Two");
map.put(null, "NullKey");
map.put(3, null);
System.out.println(map);
```

---

## 2. TreeMap

### Overview:

* Implements the `NavigableMap` interface.
* Stores entries in **sorted (ascending) order** based on keys.
* **Does not allow null keys**, but allows multiple null values.

### Syntax:

```java
Map<KeyType, ValueType> map = new TreeMap<>();
```

### Characteristics:

* Based on **Red-Black Tree**.
* Time complexity for **get()**, **put()** is **O(log n)**.
* Maintains natural ordering or custom order using a `Comparator`.

### Example:

```java
Map<Integer, String> map = new TreeMap<>();
map.put(3, "Three");
map.put(1, "One");
map.put(2, "Two");
System.out.println(map);  // Output will be sorted by keys
```

### Custom Comparator:

```java
Map<String, Integer> map = new TreeMap<>(Comparator.reverseOrder());
map.put("A", 1);
map.put("B", 2);
System.out.println(map);
```

---

## 3. LinkedHashMap

### Overview:

* Extends `HashMap` and maintains a **doubly-linked list** of entries.
* **Preserves insertion order**.
* Allows one null key and multiple null values.

### Syntax:

```java
Map<KeyType, ValueType> map = new LinkedHashMap<>();
```

### Characteristics:

* Time complexity is **O(1)** for **get()** and **put()**.
* Slightly slower than HashMap due to order maintenance.
* Useful when the order of entries matters.

### Example:

```java
Map<String, Integer> map = new LinkedHashMap<>();
map.put("Apple", 1);
map.put("Banana", 2);
map.put("Mango", 3);
System.out.println(map);  // Maintains insertion order
```

---

## Comparison Table

| Feature         | HashMap          | TreeMap          | LinkedHashMap    |
| --------------- | ---------------- | ---------------- | ---------------- |
| Order           | No order         | Sorted by keys   | Insertion order  |
| Null Keys       | One allowed      | Not allowed      | One allowed      |
| Null Values     | Multiple allowed | Multiple allowed | Multiple allowed |
| Thread-safe     | No               | No               | No               |
| Time Complexity | O(1)             | O(log n)         | O(1)             |

---

## When to Use Which?

* **HashMap**: Best for fast lookup, no need for order.
* **TreeMap**: When keys must be sorted.
* **LinkedHashMap**: When insertion order is needed.

---

## Common Methods in Map Interface

| Method                        | Description                           |
| ----------------------------- | ------------------------------------- |
| `put(K key, V value)`         | Inserts or updates the key-value pair |
| `get(Object key)`             | Returns the value for the key         |
| `remove(Object key)`          | Removes the mapping for the key       |
| `containsKey(Object key)`     | Checks if key exists                  |
| `containsValue(Object value)` | Checks if value exists                |
| `keySet()`                    | Returns a Set of all keys             |
| `values()`                    | Returns a Collection of all values    |
| `entrySet()`                  | Returns a Set of key-value pairs      |

---

## Summary

* `Map` is a powerful key-value collection interface.
* Choose `HashMap` for performance, `TreeMap` for sorting, and `LinkedHashMap` for ordered entries.
* Understand the internal working to use them effectively.
