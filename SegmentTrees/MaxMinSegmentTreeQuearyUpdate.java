package SegmentTrees;

public class MaxMinSegmentTreeQuearyUpdate {
    static int tree[];
    public static void init(int n){
        tree=new int[n*4];
    }

    public static void build(int arr[], int i, int si, int sj){
        if(si==sj){
            tree[i]=arr[si];
            return;
        }

        int mid = (si+sj)/2;
        build(arr, 2*i+1, si, mid);
        build(arr, 2*i+2, mid+1, sj);
        tree[i]=Math.max(tree[2*i+1], tree[2*i+2]);
    }

    public static int getMaxUtil(int i, int si, int sj, int qi, int qj){
        if(si>qj|| sj<qi){
            return Integer.MIN_VALUE;
        }else if(si>=qi && sj<=qj){
            return tree[i];
        }else{
            int mid = (si+sj)/2;
            int left=getMaxUtil(2*i+1, si, mid, qi, qj);
            int right=getMaxUtil(2*i+2, mid+1, sj, qi, qj);
            return Math.max(left, right);
        }
    }

    public static int getMax(int arr[], int qi, int qj){
        int n=arr.length;
        return getMaxUtil(0, 0, n-1, qi, qj);
    }

    public static void main(String[] args) {
        int arr[]={6,8,-1,2,17,1,3,2,4};
         int n=arr.length;
        init(n);
        build(arr, 0, 0, n-1);
        for(int i:tree){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(getMax(arr, 2, 5));
    }
}
