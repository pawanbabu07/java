package ArrayListCllass;

import java.util.ArrayList;

public class ContainerWithMostWate2PointerAproch {
     public static int calculateMacxValum(ArrayList<Integer> list){
        int lp=0;
        int rp=list.size()-1;
        int maxValume=0;
        while (lp<rp) { 
            int height=Math.max(list.get(rp), list.get(lp));
            int with=rp-lp;
            int curent=(height*with);
            maxValume=Math.max(maxValume, curent);
            if(list.get(rp)> list.get(lp)){
                rp--;
            }else{
                lp++;
            }
        }
        return maxValume;
     }
    public static void main(String[] args) {
      ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(calculateMacxValum(list));   
    }
}
