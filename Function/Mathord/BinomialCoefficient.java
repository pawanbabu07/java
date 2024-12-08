package Function.Mathord;


public class BinomialCoefficient {
    public static int Fact(int a){
        int f=1;
        for(int i=a;i>=1;i--){
            f*=i;
        }
        return f;
    }
    public static int BinoCoff(int n, int r){
        int fn=Fact( n);
        int fr=Fact( r);
        int fnr=Fact( (n-r));
        int c=(int)(fn/(int)(fr*fnr));
        return c;
    }
    public static void main (String args[]){
        System.out.println(BinoCoff(6, 2));
    }
    
}
