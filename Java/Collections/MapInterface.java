import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    public static void main(String[] args) {
        // Creating HashMap and adding elements
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(1, "Geeks");
        hm.put(2, "For");
        hm.put(3, "Geek");

        // Finding the value for a key
        System.out.println("Value for 1 is " + hm.get(1));

        // Traversing through the HashMap
        for (Map.Entry<Integer, String> e : hm.entrySet())
            System.out.println(e.getKey() + " "
                    + e.getValue());
    }
    
    /*
     🔹 What it does:
               hm.entrySet() gives all the key-value pairs in the map.

               Map.Entry<Integer, String> e represents one pair at a time.

               e.getKey() gets the key.

               e.getValue() gets the value.

               It prints each key and its value.
     */
}
