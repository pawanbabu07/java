package Array;

public class Q2 {
    public static int max(int ar[]){
        int nin=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>nin){
                nin=ar[i];

            }
        }
        return nin;
    }
    public static void main(String[] args){
        int ar[]={1,2,5,3,7,5,4,9,2,8,1};
        System.out.println(max(ar));

    }
    
}
