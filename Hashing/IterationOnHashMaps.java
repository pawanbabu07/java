package Hashing;

import java.util.HashMap;
import java.util.Set;

public class IterationOnHashMaps {
    public static void main(String[] args) {
        
        HashMap<String, Integer> hm = new HashMap<>();
        
        hm.put("India", 700);
        hm.put("China", 1000);
        hm.put("USA", 300);

        Set<String> st= hm.keySet();
        for (String key : st) {
            System.out.println("Key= "+key+"  value= "+hm.get(key));
        }

        System.out.println("---------------");

        System.out.println(hm.entrySet());
    }
}
