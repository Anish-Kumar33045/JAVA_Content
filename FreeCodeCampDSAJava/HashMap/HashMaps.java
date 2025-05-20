// for more hash map method refer geeks for geeks 
// https://www.geeksforgeeks.org/map-interface-java-examples/

import java.util.*;

public class HashMaps {

    public static int simpleHash(String key) {
        int sum = 0;
        for (char c : key.toCharArray()) {
            sum += (int) c;

        }
        return sum % 10;
    }

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
// key = String , value = Integer here 
        map.put("apple", 50);
        map.put("banana", 25);
        map.put("orange", 35);
        map.put("grapes", 65);

        map.put("banana", 20); // value changes to 20

        map.put(null, 200); // key can have one null
        map.put(null, 300); // value will be replaced tp 300 then 

        int ApplePrice = map.get("apple");
        System.out.println("ApplePrice : " + ApplePrice);

        System.out.println(map.containsKey("banana"));

        System.out.println(map.containsValue(25));

        Set<String> set = map.keySet();
        System.out.println(set); // order not maintained

        System.out.println();

        // iteration of hashmap
        // normal for loop 
        List<String> keys = new ArrayList<>(map.keySet());

        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            System.out.println(map.get(key) + " ");
        }

        // enhanced for loop
        for (String i : map.keySet()) {
            System.out.print(map.get(i) + " ");
        }

        System.out.println();

        // Map entry 
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        // iterator
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // for each and lamda 
        map.forEach((key, value) -> {
            System.out.println(key + " = " + value);
        });

        map.remove("apple");

        boolean rem = map.remove("Jackfruit", 75); // this entry not there 
        System.out.println("removed jackfruit : " + rem);

        System.out.println(map);

        System.out.println(simpleHash("zyX"));  // hash function we created 
        System.out.println(simpleHash("Xyz"));
        System.out.println(simpleHash("okay"));

    }

}
