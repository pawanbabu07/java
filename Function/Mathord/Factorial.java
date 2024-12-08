package Function.Mathord;
public class Factorial{
    public static int Factor(int a){
        int f=1;
        for(int i=a; i>=1;i--){
            f*=i;
        }
        return f;
    }
    public static void main (String args[]){
        int f = Factor(4);
        System.out.println(f);
    }
}