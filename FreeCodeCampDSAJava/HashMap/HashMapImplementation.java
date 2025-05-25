
import java.util.LinkedList;

public class HashMapImplementation {

    /*
A generic class MyHashMap<K, V> is created, where:

K is the type of key.

V is the type of value.
     */
    static class MyHashMap<K, V> {

        public static final int DEFAULT_CAPACITY = 4; // Initial number of buckets.
        public static final float DEFAULT_LOAD_FACTOR = 0.75f; // Threshold to trigger rehashing.

        private class Node {

            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

// Each Node holds one key-value pair.
// This is what’s stored in the buckets (which are LinkedLists).
        // 
        private int n; //num of entries in Map
        private LinkedList<Node>[] buckets; // Array where each element is a LinkedList<Node>. This is the core of HashMap’s internal storage.

        public int size() { // return num of entries in Map
            return n;
        }

// initialize buckets (Each bucket is a LinkedList<Node> (for separate chaining).)
        private void initBuckets(int N) { // N = capacity or size of bucket array 

            buckets = new LinkedList[N];

            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

        }

        private int HashFunc(K key) {
            int hc = key.hashCode();
            return (Math.abs(hc)) % buckets.length;
            // Math.abs() to avoid negative indices.
            // % buckets.length ensures index lies within bucket array size.
        }

//traverses ll and looks for a node with key , if found it returns it's index otherwise null
        private int searchInBucket(LinkedList<Node> ll, K key) {
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key.equals(key)) {
                    return i;
                }
            }
            return -1;
        }

        public MyHashMap() {
            initBuckets(DEFAULT_CAPACITY); // Initializes the HashMap with the default capacity.
        }

        private void rehash() {
            LinkedList<Node>[] oldbuckets = buckets;
            initBuckets(oldbuckets.length * 2);
            n = 0;
            for (var bucket : oldbuckets) {
                for (var node : bucket) {
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) { // insert / update
            int bi = HashFunc(key);  // find the bucket index
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);

            if (ei == -1) { // key not found  
                Node node = new Node(key, value);
                currBucket.add(node);
                n++;
            } else { // key found 
                Node currNode = currBucket.get(ei);
                currNode.value = value;
            }
            if (n >= buckets.length * DEFAULT_LOAD_FACTOR) {
                rehash();
            }
        }

        public V get(K key) {
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);

            if (ei != -1) {
                Node currNode = currBucket.get(ei);
                return currNode.value;
            }
            return null;
        }

        public V remove(K key, V value) {
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if (ei != -1) {
                Node currNode = currBucket.get(ei);
                V val = currNode.value;
                currBucket.remove(ei);
                n--;
                return val;
            }
            return null;
        }

        public int capacity() {
            return buckets.length;
        }

        public float load() {
            return (n * 1.0f) / buckets.length;
        }
    }

    public static void main(String[] args) {
        MyHashMap<String, Integer> mp = new MyHashMap<>();
        System.out.println("Testing put :");
        mp.put("a", 1);
        mp.put("b", 2);

        System.out.println("Capacity : " + mp.capacity()); //4
        System.out.println("Load : " + mp.load());

        mp.put("c", 3);
        mp.put("x", 61);
        mp.put("y", 71);

        // testing capacity after inserting five elements 
        System.out.println("Capacity : " + mp.capacity()); //8
        System.out.println("Load : " + mp.load()); // < 0.75

        System.out.println("Testing size : " + mp.size());

        // System.out.println("Testing size" + mp.size()); // 3
        // mp.put("c", 4);
        // System.out.println("Testing size" + mp.size()); // 3
        //tesing get 
        System.out.println(mp.get("a"));
        System.out.println(mp.get("b"));
        System.out.println(mp.get("c"));
        System.out.println(mp.get("d"));

        // testing rehash
        System.out.println(mp.get("x"));
        System.out.println(mp.get("y"));

        // System.out.println();
        // // Testing remove 
        // System.out.println(mp.remove("c", 4));
        // System.out.println(mp.remove("c", 4)); // doesn't exists 
        // System.out.println("size is : " + mp.size()); //2 
    }
}
