package DynamicProgramming.dp4;

public class StrngConversion {
    public static int convert(String str1, String str2){
        int n=str1.length(), m=str2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=i;
        }
        for(int i=0;i<dp[0].length;i++){
            dp[0][i]=i;
        }
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.min(dp[i-1][j], dp[i][j-1]) +1;
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        String str1="pear";
        String str2 = "sea";
        System.out.println(convert(str1, str2));
    }
}
