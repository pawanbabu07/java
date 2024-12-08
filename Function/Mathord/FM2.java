package Function.Mathord;
import java.util.Scanner;

public class FM2 {
    public static int sumTwo(int a, int b){
       

        int sum= a+b;
        return sum;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a=sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
       
        System.out.println("Sum: "+ sumTwo(a, b));

    }
}
