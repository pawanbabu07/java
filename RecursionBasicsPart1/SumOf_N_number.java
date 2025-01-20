package RecursionBasicsPart1;

public class SumOf_N_number {
    public static int SumN(int n){
        if(n==1){
            return 1;
        }
        SumN(n-1);
        int f=n+SumN(n-1);
        return f;
    }
    public static void main(String[] args) {
        System.out.print(SumN(5));
    }
}
