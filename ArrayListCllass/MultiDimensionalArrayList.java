package ArrayListCllass;
import java.util.ArrayList;
public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> multi=new ArrayList<>();
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        ArrayList<Integer> l3=new ArrayList<>();
        for(int i=1;i<=5;i++){
            l1.add(i*1);
            l2.add(i*2);
            l3.add(i*3);
        }
        multi.add(l1);
        multi.add(l2);
        multi.add(l3);
        System.out.println(multi);

        for(int i=0;i<multi.size();i++){
            ArrayList<Integer> current= multi.get(i);
            for(int j=0;j<current.size();j++){
                System.out.print(current.get(j)+" ");
            }
            System.out.println();
        }
    }
}
