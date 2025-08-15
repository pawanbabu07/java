package DynamicProgramming.dp3;

public class RodCutting {
    public static int rodCost(int[] length, int price[], int totPrice){
        int n= price.length;
        int[][] dp= new int[n+1][totPrice+1];
        for(int i=0; i<dp.length; i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
        }

        for(int i=1; i< dp.length;i++){
            for(int j=0; j<dp[0].length; j++){
                if(length[i-1]<=j){
                    dp[i][j]=Math.max(price[i-1]+dp[i][j-length[i-1]], dp[i-1][j]);
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][totPrice];
    }

    public static void main(String[] args) {
        int length[]={1,2,3,4,5,6,7,8};
        int cost[]={1,5,8,9,10,17,17,20};
        int totalPrice=8;
        System.out.println(rodCost(length, cost, totalPrice));
    }
}
