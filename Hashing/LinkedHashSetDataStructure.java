package Hashing;

import java.util.LinkedHashSet;

public class LinkedHashSetDataStructure {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("Patna");
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengaluru");
        
        System.out.println(lhs);
    }
}
