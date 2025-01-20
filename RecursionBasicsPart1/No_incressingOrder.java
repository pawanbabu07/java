package RecursionBasicsPart1;

public class No_incressingOrder {
    public static void IncOrder(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        IncOrder(n-1);
        System.out.print(n+" ");
    }
    public static void main(String args[]){
        IncOrder(10);
    }
}
