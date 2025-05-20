
import java.util.*;

public class ThreadSafeHashMapDemo {

    public static void main(String[] args) {
        // Create a synchronized (thread-safe) HashMap
        Map<String, String> map = Collections.synchronizedMap(new HashMap<>());

        // Add entries from multiple threads
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                map.put("T1-Key" + i, "Value" + i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                map.put("T2-Key" + i, "Value" + i);
            }
        });

        t1.start();
        t2.start();

        // Wait for threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Synchronized block while iterating
        synchronized (map) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }
}
