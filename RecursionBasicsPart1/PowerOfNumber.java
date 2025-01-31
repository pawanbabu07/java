package RecursionBasicsPart1;
import java.util.*;
public class PowerOfNumber {
    public static int power(int b , int p){
        if(p==0){
            return 1;
        }
        return b*power(b, p-1);
    }
    public static int power2(int b, int p){
        int powerIs;
        if(p==0){
            return 1;
        }
       int halfPower=power2(b, p/2);
        if(p%2!=0){
            powerIs=b*halfPower*halfPower;
        }else{
            powerIs=halfPower*halfPower;
        }
        return powerIs;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base and power ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        sc.close();
        System.out.println("Enter the x^y: "+power(n, m));
        System.out.println("Enter the x^y: "+power2(n, m));
    }
}
