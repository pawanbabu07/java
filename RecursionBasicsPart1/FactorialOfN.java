package RecursionBasicsPart1;

public class FactorialOfN {
    public static int FacOfNo(int n){
        if(n==0){
            return 1;
        }
        FacOfNo(n-1);
        int f=n*FacOfNo(n-1);
        return f;
    }
    public static void main(String[] args) {
        System.out.println(FacOfNo(4));
    }
    
}
