package DynamicProgramming.dp5;

public class CatalansNumberRecursion {
    public static int catalannumber(int n){
        if(n==0||n==1){
            return 1;
        }
        int ans=0;
        for(int i=0;i<=n-1;i++){
            ans +=catalannumber(i)*catalannumber(n-i-1);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(catalannumber(25));
    }
}
