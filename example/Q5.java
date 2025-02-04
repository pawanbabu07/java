package example;

public class Q5 {
    public static void main(String[] args) {
        int ar[]={7,4,9,6,8,5,2,0,3,1};
        
        for (int i = 0; i <ar.length; i++) {
            int minium=i;
            for(int j=i+1;j<ar.length;j++){
                if(ar[minium]>ar[j]){
                    minium=j;
                }
            }    
            int tamp=ar[minium];
            ar[minium]=ar[i];
            ar[i]=tamp;
        }
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
}

