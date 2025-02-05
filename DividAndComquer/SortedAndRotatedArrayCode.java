package DividAndComquer;

public class SortedAndRotatedArrayCode {
    public static int search(int arr[], int tar, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;
        if (arr[mid] == tar) {
            return mid;
        }
        // Case: mid is on L1 (left sorted part)
        if (arr[si] <= arr[mid]) {
            // Case a: target is in the left part
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid - 1);
            } else {
                // Case b: target is in the right part
                return search(arr, tar, mid + 1, ei);
            }
        }
        // Case: mid is on L2 (right sorted part)
        else {
            // Case c: target is in the right part
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            } else {
                // Case d: target is in the left part
                return search(arr, tar, si, mid - 1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int tar = 0;
        int index = search(arr, tar, 0, arr.length - 1);
        System.out.println(index);  // Output should be 5
    }
}