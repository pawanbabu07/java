package Hashing;

import java.util.LinkedHashMap;

public class LinkedHashMapImplemataion {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm= new LinkedHashMap<>();

        lhm.put("usa", 50);
        lhm.put("china", 500);
        lhm.put("india", 100);
        lhm.put("nepal", 20);
        

        System.out.println(lhm);
    }
}
