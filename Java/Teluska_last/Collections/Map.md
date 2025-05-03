A map is a data structure that supports the key-value pair for mapping the data.
This interface doesn’t support duplicate keys because the same key cannot have multiple mappings, however, it allows duplicate values in different keys.
A map is useful if there is data and we wish to perform operations on the basis of the key.
This map interface is implemented by various classes like HashMap, TreeMap, etc. Since all the subclasses implement the map, we can instantiate a map object with any of these classes.

For example:

Map<T> hm = new HashMap<> ();
Map<T> tm = new TreeMap<> ();

Where T is the type of the object.

The frequently used implementation of a Map interface is a HashMap.

1. HashMap
   HashMap provides the basic implementation of the Map interface of Java.
   It stores the data in (Key, Value) pairs.
   To access a value in a HashMap, we must know its key.
   HashMap uses a technique called Hashing.

What is Hashing?
Hashing is a way to turn a big value (like a long string) into a small number (called a hash code).
This makes searching and indexing faster.

🔹 What is HashSet?
HashSet uses hashing to store unique elements.
Internally, it uses a HashMap to manage the data.
