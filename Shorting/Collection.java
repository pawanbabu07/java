package Shorting;

public class Collection {
    public static void Collec(int ar[]){
        int larg=Integer.MIN_VALUE;
        for(int i=0; i<ar.length;i++){
            larg=Math.max(larg, ar[i]);
        }
        int timp[]=new int[larg+1];
        for(int i=0;i<ar.length;i++){
            timp[ar[i]]++;
        }

        int j=0;
        for(int i=0; i<timp.length;i++){
            while(timp[i]>0){
                ar[j]=i;
                j++;
                timp[i]--;
            }
        }
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]);
        }
    }
    public static void main(String[] args){
        int ar[]={5,8,1,7,3,9,4,6,2};
        Collec(ar);
    }
    
}
