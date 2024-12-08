package Array;

public class binerySearch {
    public static int midSearch(int ar[], int k){
        int s=k;
        int start=0,end=ar.length;
        while(start<=end){
            int mid=(int)((start+end)/2);
            if(ar[mid]==s){
                return mid;
            }
            else if(ar[mid]<s){
                start=mid+1;
            }
            else{
                start=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int ar[]={1,2,3,4,5,6,7,8,9,10};
        int k=15;
        int result=midSearch(ar, k);
        System.out.println(result);
    }
    
}
