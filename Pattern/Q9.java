package Pattern;

public class Q9 {
    public static void main(String[] args){
        int n=4;
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-1-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=1+2*i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
       
        for(int i=n;i>0;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=-1+2*i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    
}
