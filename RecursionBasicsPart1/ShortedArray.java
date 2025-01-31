package RecursionBasicsPart1;

public class ShortedArray {
    public static boolean ShortedArray(int ar[], int i){
       if(i==ar.length-1){
        return true;
       }
        if(ar[i]>ar[i+1]){
        return false;
       }
       return ShortedArray(ar, i+1);
    }
    public static void main(String[] args) {
        int[] ar={1,2,3,4,5,6};
        System.out.println(ShortedArray(ar,0));
    }
}
