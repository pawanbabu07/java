package RecursionBasicsPart1;
public class FirstAndLastOccurrenc{
    public static int FirstIndex(int ar[],int i, int n){
        if(i==ar.length){
            return -1;
        }
        if(ar[i]==n){
            return i;
        }
        return FirstIndex(ar, i+1, n);
    }
    public static int LastIndex(int ar[],int i, int n){
        int ln=ar.length-i-1;
        if(ln==-1){
            return -1;
        }
        if(ar[ln]==n){
            return ln;
        }
        return LastIndex(ar, i=1+1, n);
    }
    public static void main(String[] arg){
        int[] ar={1,8,3,5,6,4,5,9,0};
        System.out.println(FirstIndex(ar,0,8));
        System.out.println(LastIndex(ar,0,5));
    }
}