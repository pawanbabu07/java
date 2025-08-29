package SegmentTrees;

public class updateOnST {
    static int tree[];
    public static void init(int n){
        tree = new int[n*4];
    }
    public static  int buildst(int arr[], int i, int start, int end){
        if(start==end){
            tree[i]=arr[start];
            return arr[start];
        }
        int mid=(start+end)/2;
        buildst(arr, 2*i+1, start, mid);
        buildst(arr, 2*i+2, mid+1, end);
        tree[i]=tree[2*i+1]+tree[2*i+2];
        return tree[i];
    }

    public static int getSumUtil(int i, int si, int sj, int qi, int qj){  //O(logn)
        if(qj<=si || qi>=sj){   //non overlappuing
            return 0;
        }else if(si>=qi && sj<=qj){  //complete overlaping
            return tree[i];
        }else{      //partial overlaping
            int mid=(si+sj)/2;
            int left=getSumUtil(2*i+1, si, mid, qi, qj);
            int right=getSumUtil(2*i+2, mid+1, sj, qi, qj);
            return left+right;
        }
    }

    public static int getSum(int arr[], int qi,int qj){
        int n=arr.length;
        return getSumUtil(0, 0, n-1, qi, qj);
    }

    public static void updateUtil(int i, int si, int sj, int idx, int diff){ //O(logn)
        if(idx>sj || idx<si){
            return ;
        }
        tree[i]+=diff;
        if(si!=sj){// non-leaf
            int mid =(si+sj)/2;
            updateUtil(2*i+1, si, mid, idx, diff);   //left part
            updateUtil(2*i+2, mid+1, sj, idx, diff);  //right part
        }
    }

    public static void update(int arr[], int idx, int newValue){
        int n=arr.length;
        int diff=newValue-arr[idx];
        arr[idx]=newValue;
        updateUtil(0, 0, n-1, idx, diff);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int n=arr.length;
        init(n);
        buildst(arr, 0, 0, n-1);
        for(int i : tree){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(getSum(arr, 2, 5));
        update(arr, 2, 2);
        System.out.println(getSum(arr, 2, 5));
    }
}
