package Hashing;

import java.util.HashMap;

public class HashMapOperations {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        
        // Insert the element in the HashMap   O(1)
        hm.put("India", 700);
        hm.put("China", 1000);
        hm.put("USA", 300);

        System.out.println(hm);

        //peek the element     O(1)
        System.out.println(hm.get("China"));

        //Delete the element form hashMap    O(1)
        System.out.println(hm.remove("USA"));
        System.out.println(hm);

        // contain the key or not    O(1)
        System.out.println(hm.containsKey("China"));
        System.out.println(hm.containsKey("Andonisha"));

        //size of hashMap   O(1)
        System.out.println( hm.size());
        
        //hashmap is empty or not   O(1)
        System.out.println(hm.isEmpty());

        //clear the hashmap     O(1)
        hm.clear();
        System.out.println(hm);
        System.out.println(hm.size());

    }
}
