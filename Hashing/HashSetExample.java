package Hashing;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String args[]){
        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(4);
        hs.add(2); // duplicate, will be ignored
        hs.add(1); // duplicate, will be ignored
        hs.add(4); // duplicate, will be ignored
        System.out.println(hs);             // prints unique elements
        System.out.println(hs.size());      // size of set
        System.out.println(hs.contains(2)); // true
        System.out.println(hs.contains(3)); // false
        hs.remove(2);
        System.out.println(hs);             // 2 removed
        System.out.println(hs.contains(2)); // false
        System.out.println(hs.isEmpty());   // false
        hs.clear();
        System.out.println(hs.isEmpty());   // true
    }
}
