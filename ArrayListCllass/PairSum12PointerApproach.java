package ArrayListCllass;

import java.util.ArrayList;

public class PairSum12PointerApproach {
    public static boolean printPairSum(ArrayList<Integer> list,int n){

        int lp=0;
        int rp=list.size()-1;
        while(lp<rp){
            if((lp+rp)==n){
                return true;
            }else if((lp+rp)<n){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(printPairSum(list,40));
    }
}
