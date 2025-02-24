package ArrayListCllass;
import java.util.ArrayList;
public class PairSum1BruteForce {
    public static boolean printPairSum(ArrayList<Integer> list, int n){
        boolean check=false;;
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if((i*j)==n){
                    return true;
                }
            }
        }
        return check;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(printPairSum(list,50));
    }
}
