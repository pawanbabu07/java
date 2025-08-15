package DynamicProgramming.dp3;

public class CoinChamge {
    public static int coinChange(int coins[], int sum){
        int n=coins.length;
        int dp[][]=new int[n+1][sum+1];
        // initialize - sum is 0
        // i-> coin; j-> sum/change
        for(int i=0;i<dp.length;i++){
            dp[i][0]=1;
        }
        for(int j=1;j<dp[0].length;j++){
            dp[0][j]=0;
        }
        //O(N+SUM)
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(coins[i-1] <= j){ //valid
                    dp[i][j]=dp[i][j-coins[i-1]] + dp[i-1][j];
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }

    public static void main(String[] args) {
        int coins[] = {1,2,3};
        int sum=10;
        System.out.println(coinChange(coins, sum));
    }
}
