package RecursionBasicsPart1;

public class No_decreasingOrder {
    public static void print_dec(int n){
    if(n==1){
        System.out.print(n);
        return;
    }
    System.out.print(n+" ");
    print_dec(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        print_dec(n);
    }
}
