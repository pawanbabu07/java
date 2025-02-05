package DividAndComquer;
/*
 * NOTE:
       Worst case occurs when pivot is slways
       the smallest or the largest element;
 */

public class SortedAndRotatedArray {
    public static int search(int arr[], int tar, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;
        if (arr[mid] == tar) {
            return mid;
        }
        // Case: mid is on L1 
        if (arr[si] <= arr[mid]) {
            // Case a:left part
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid - 1);
            } else {
                // Case b:right part
                return search(arr, tar, mid + 1, ei);
            }
        }
        // Case: mid is on L2 
        else {
            // Case c:right part
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            } else {
                // Case d: left part
                return search(arr, tar, si, mid - 1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int tar = 0;
        int ind = search(arr, tar, 0, arr.length - 1);
        System.out.println(ind);
    }
}
