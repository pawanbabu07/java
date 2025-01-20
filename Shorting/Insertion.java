package Shorting;
public class Insertion {
    public static void Insst(int ar[]){
        for(int i=0;i<ar.length;i++){
            int c=ar[i];
            int p=i-1;
            while(p>=0 && ar[p]>c){
                ar[p+1]=ar[p];
                p--;
            }
            ar[p+1]=c;
        }
        for(int i=0; i<ar.length; i++){
            System.out.print(ar[i]+" ");
        }
    }
    public static void main(String[] args){
        int ar[]={1,5,8,4,2,7,3,6};
        Insst(ar);
    }
    
}
