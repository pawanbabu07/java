package DynamicProgramming.dp4;

public class EditDistance {
    public static int dist(String str1, String str2){ //O(n*m)
        int n=str1.length();
        int m= str2.length();
        int[][] dp= new int[n+1][m+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=i;
        }
        for(int i=0;i<dp[0].length;i++){
            if(i==0){
                dp[0][i]=1;
            }else{
                dp[0][i]=i;
            }  
        }

        //bottem up
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }else{
                    int add= dp[i][j-1] +1;
                    int del = dp[i-1][j] +1;
                    int rem = dp[i-1][j-1] +1;
                    dp[i][j]=Math.min(add, Math.min(del, rem));
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        String word1="intention";
        String word2 = "execution";
        System.out.println(dist(word1, word2));
    }
}
