
public class Chaining<K, V> {

    class Node<K, V> {

        K key;
        V value;
        Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private final int SIZE = 16;
    private Node<K, V>[] table;

    public Chaining() {
        table = new Node[SIZE];
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % SIZE;
    }

    public void put(K key, V value) {
        int index = hash(key);
        Node<K, V> newNode = new Node<>(key, value);

        if (table[index] == null) {
            table[index] = newNode;
        } else {
            // Collision handling by chaining
            Node<K, V> current = table[index];
            Node<K, V> prev = null;

            while (current != null) {
                if (current.key.equals(key)) {
                    // Update existing key
                    current.value = value;
                    return;
                }
                prev = current;
                current = current.next;
            }
            prev.next = newNode;
        }
    }

    public V get(K key) {
        int index = hash(key);
        Node<K, V> current = table[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null; // not found
    }

    public static void main(String[] args) {
        Chaining<String, Integer> map = new Chaining<>();

        map.put("apple", 10);
        map.put("banana", 20);
        map.put("grape", 30);

        // This key likely causes collision (depends on hashCode)
        map.put("papel", 40); // 'papel' is an anagram of 'apple', often collides in simple hash

        System.out.println("Value for apple: " + map.get("apple"));   // 10
        System.out.println("Value for banana: " + map.get("banana")); // 20
        System.out.println("Value for grape: " + map.get("grape"));   // 30
        System.out.println("Value for papel: " + map.get("papel"));   // 40
    }
}
