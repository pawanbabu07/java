package Array;

public class Prifix {
    public static void prifix(int ar[]){
        int max=Integer.MIN_VALUE;
        int currSum=0;
        int maxSum=0;
        int prifix[]=new int[ar.length];
        prifix[0]=ar[0];
        for(int i=1;i<ar.length;i++){
            prifix[i]=prifix[i-1]+prifix[i];
        }
        for(int i=0;i<ar.length;i++){
            for(int j=1;j<ar.length;j++){
            currSum=i==0?prifix[j]:prifix[j]+prifix[i-1];
            }
            if(max<currSum){
                maxSum=currSum;
            }
        }
        System.out.println(maxSum);

    }
    public static void main(String[] args){
        int ar[]={1,9,-5,-7,3};

        prifix(ar);
    }
   
}
