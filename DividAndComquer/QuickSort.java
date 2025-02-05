package DividAndComquer;
/*
 NOTE:-
 Worst case occurs when pivot is always the 
 smallest or the largest element.
 */
public class QuickSort {
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void quickSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        //last element
        int pIdx= partition(arr,si,ei);
        quickSort(arr, si, pIdx-1);
        quickSort(arr, pIdx+1, ei);
    }
    public static int partition(int arr[], int si, int ei){
        int pivot =arr[ei];
        int i=si-1; //ro make place for els smaller then pivot
        for(int j=si;j<ei; j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp= pivot;
        arr[ei]=arr[i]; 
        arr[i]=temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[]={8,6,1,5,3,9,4,7,2};
        quickSort(arr,0,arr.length-1);
        printarray(arr);
    }
}
