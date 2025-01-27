package Shorting;
public class Selection {
    public static void Select(int ar[]){
        for(int i=0; i<ar.length-1;i++){
            int minium=i;
            for(int j=i+1; j<ar.length;j++){
               if(ar[minium]>ar[j]){
                minium=j;
               }
            }
            int tamp=ar[minium];
            ar[minium]=ar[i];
            ar[i]=tamp;
        }
        for(int i=0; i<ar.length; i++){ 
            System.out.print(ar[i]+" ");
        }
    }
    public static void main(String[] args){
        int ar[]={9,4,7,3,1,8,6,2,5};
        Select(ar);
    }  
}
