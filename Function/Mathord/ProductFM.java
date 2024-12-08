package Function.Mathord;


public class ProductFM {
    public static int Product(int a, int b){
        int p = a*b;
        return p;
    }
    public static void main (String[] args){
       
        int a=4;
        int b = 6;
        int p = Product(a, b);
        System.out.println(p);
    }
    
}
