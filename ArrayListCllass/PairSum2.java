package ArrayListCllass;

import java.util.ArrayList;

public class PairSum2 {
    public static boolean printPairSum(ArrayList<Integer> list,int n){
        int bp=-1;
        int l=list.size();
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }
        int rp=bp;
        int lp=bp+1;
        while(lp!=rp){
            if((list.get(lp)+list.get(rp))==n){
                return true;
            }else if((list.get(lp)+list.get(rp))<n){
                lp=(lp+1)%l;
            }else{
                rp=(l+rp-1)%l;
            }
        }
        return false;
    }
    public static void main(String[] args) {
         ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(printPairSum(list,17));
    }
    
}
