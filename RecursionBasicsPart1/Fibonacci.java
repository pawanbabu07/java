package RecursionBasicsPart1;

public class Fibonacci {
    public static int FiboNo(int n){
       if(n==0||n==1){
        return n;
       } 
       int f=FiboNo(n-1)+FiboNo(n-2);
       return f;
    }
    public static void main(String[] args) {
        System.out.println(FiboNo(6));
    }
}
