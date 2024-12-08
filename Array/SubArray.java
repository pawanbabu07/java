package Array;

public class SubArray {
    public static void subar(int ar[]){
        for(int i =0;i<ar.length;i++){
            for(int j=i;j<=ar.length-1;j++){
                System.out.print("(");
                for(int k=i;k<=j;k++){
                    System.out.print(ar[k]+" ");
                }
                System.out.print(")");
                System.out.print(" ");
            } 
        }
    }

    public static void subarSum(int ar[]){
        
        int max=Integer.MIN_VALUE;
        for(int i =0;i<ar.length;i++){
            int sum=0;
            for(int j=i;j<=ar.length-1;j++){
                for(int k=i;k<=j;k++){
                    sum=sum+ar[k];
                }
            }
            if(max<sum){
                max=sum;
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args){
        int ar[] = {1,5,7,9,6};
        subarSum(ar);
        subar(ar);
    }
    
}
