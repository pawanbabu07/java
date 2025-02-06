package Shorting;
public class OptmiseBubbleSort {
    public static void bubbleShort(int ar[]){
        for(int i=0; i<ar.length;i++){
            boolean check=true;
            for(int j=0;j<ar.length-1-i;j++){
                if(ar[j]>ar[j+1]){
                    int tamp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=tamp;
                    check=false;
                }
            }
            if(check){
                break;
            }
        }
        for(int i=0; i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
    public static void main(String[] args){
        int ar[]={7,4,9,6,8,5,2,0,3,1};
        bubbleShort(ar);
    }
}
