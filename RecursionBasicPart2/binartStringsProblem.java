package RecursionBasicPart2;

public class binartStringsProblem {
    public static void bineryString(int n,int baseCase, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        bineryString(n-1, 0, str+"0");
        if(baseCase==0){
            bineryString(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        bineryString(4, 0, "");
    }
}
