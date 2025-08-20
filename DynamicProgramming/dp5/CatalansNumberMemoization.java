package DynamicProgramming.dp5;

import java.util.Arrays;

public class CatalansNumberMemoization {
    public static int catalannumber(int n, int[] arr){
        if(n==0||n==1){

            return 1;
        }
        int ans=0;
        if(arr[n]!=-1){
            return arr[n];
        }
        for(int i=0;i<=n-1;i++){
            ans +=catalannumber(i,arr)*catalannumber(n-i-1,arr);
        }
        return arr[n]=ans;
    }

    public static void main(String[] args) {
        int n=4;
        int arr[] = new int[n+1];
        Arrays.fill(arr,-1);
        arr[0]=1;
        arr[1]=1;
        System.out.println(catalannumber(n, arr));
    }
}
