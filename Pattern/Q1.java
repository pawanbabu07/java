package Pattern;

public class Q1 {
    public static void main(String[] args){
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=n;j>=1;j--){
                if(i==1||j==1||j==n||i==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }
            System.out.println();

        }
    }
}
