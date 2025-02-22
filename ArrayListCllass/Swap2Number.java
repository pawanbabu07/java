package ArrayListCllass;

import java.util.ArrayList;

public class Swap2Number {
    public static void main(String[] args) {
         ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        int temp=list.get(2);
        list.set(2,list.get(3));
        list.set(3,temp);
        System.out.println(list);
    }
}
