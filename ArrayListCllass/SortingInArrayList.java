package ArrayListCllass;
import java.util.ArrayList;
import java.util.Collections;

public class SortingInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(5);
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        
        Collections.sort(list);//sort the arraylist in assinding order
        System.out.println(list);

        //sort the arraylist in disinding order 
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
    
}
