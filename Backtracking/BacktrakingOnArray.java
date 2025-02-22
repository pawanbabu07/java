package Backtracking;

public class BacktrakingOnArray {
    public static void backtrakingOnArray(int ar[],int i,int var){
        if(i==ar.length){
            printArray(ar);
            return;
        }
        ar[i]=var;
        backtrakingOnArray(ar, i+1, var+1);
        ar[i]=ar[i]-2;
    }
    public static void printArray(int ar[]){
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }System.out.println();

    }
    public static void main(String[] args) {
        int ar[]=new int[5];
        backtrakingOnArray(ar, 0, 1);
        printArray(ar);
    }
}
