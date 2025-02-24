package ArrayListCllass;
import java.util.*;
public class ContainerWithMostWaterBruteForce {
    public static int calculateMacxValum(ArrayList<Integer> list){
        int maxValume=0;
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                int height=Math.min(list.get(i),list.get(j));
                int with=j-i;
                int newValume=height*with;
                maxValume=Math.max(maxValume, newValume);
            }
        }
        return maxValume;
    }
    public static void main(String[] args){
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
