package ArrayListCllass;
import java.util.ArrayList;
public class BasicArrayLists {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        //Add the element in arraylist
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);

        //add element at index in arraylist
        list.add(2,9);
        System.out.println(list);

        //get element from arraylist
        int n1=list.get(4);
        System.out.println(n1);

        //Delet the element from arraylist
        list.remove(2);
        System.out.println(list);
        list.set(3,9);
        System.out.println(list);

        // to chake the element present in arraylist(return in true or false)
        System.out.println(list.contains(9));
        System.out.println(list.contains(12));

        //print the length of arraylist
        System.out.println(list.size());
    }
    
}
