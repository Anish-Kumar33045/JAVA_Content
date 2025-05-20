# Garbage Collection

## What is Garbage Collection?
* Garbage Collection (GC) is the process by which Java automatically frees up memory by deleting objects that are no longer reachable or used in the program.

* Java does this automatically — you don’t need to manually delete objects (like in C or C++).

## Why is it needed?
* To avoid memory leaks

* To manage memory efficiently

* To make programming easier (no need to manually free memory)

## When is an object eligible for garbage collection?
* An object is eligible for GC when:

* There are no more references to it.

For example:
<pre>
MyClass obj = new MyClass(); // object created
obj = null; // now the object is eligible for GC
</pre>

## How does Java collect garbage?
* The JVM uses various algorithms (like Mark-and-Sweep, Generational GC) behind the scenes to:

* Mark: Find all reachable objects.

* Sweep: Delete all unreachable (garbage) objects.