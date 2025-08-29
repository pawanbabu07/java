package SegmentTrees;

public class CreationOfST {
    static int tree[];
    public static void init(int n){
        tree = new int[n*4];//tske the max size 
    }
    public static int buildSt(int arr[], int i, int start, int end){
        if(start==end){
            tree[i]=arr[start];
            return arr[start];
        }
        int mid = (start+end)/2;
        buildSt(arr, 2*i+1, start, mid);//left subtree->n*i+1
        buildSt(arr, 2*i+2, mid+1, end);//right subtree->n*i+2
        tree[i]=tree[2*i+1]+tree[2*i+2];
        return tree[i];
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int n = arr.length;
        init(n);
        buildSt(arr, 0, 0, n-1);
        for(int i=0;i<tree.length;i++){
            System.out.print(tree[i]+" ");
        }
    }
}
