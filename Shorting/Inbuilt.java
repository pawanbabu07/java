package Shorting;
import java.util.Arrays;

public class Inbuilt {
    public static void assinding(int ar[]){
        Arrays.sort(ar);
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
   
    public static void main(String[] args){
        int ar[]={5,8,1,9,7,3,6,4,2};
        assinding(ar);
    }
     
    
}
