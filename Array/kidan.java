package Array;

public class kidan {
    public static void kid(int ar[]){
        int ms=Integer.MIN_VALUE;
        int cs= 0;
        for(int i=0;i<ar.length;i++){
            cs=cs+ar[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(ms, cs);
        }
        System.out.println(ms);
    }
    public static void main(String[] args){
        int ar[]={-1,9,-7,6,8,-2};
        kid(ar);
    }
 
}
