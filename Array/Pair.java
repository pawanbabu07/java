package Array;

public class Pair {
    public static void pair(int ar[]){
        int tp=0;
        for(int i=0;i<ar.length; i++){
            for(int j=i+1; j<ar.length; j++){
                System.out.print("("+ar[i]+","+ar[j]+") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println(tp);
    }
    public static void main(String[] args){
        int ar[]={2,4,6,8,10,12,14,16};
        pair(ar);
    }
    
}
