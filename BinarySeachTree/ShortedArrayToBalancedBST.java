package BinarySeachTree;

public class ShortedArrayToBalancedBST {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data= data;
            this.left= this.right= null;
        }
    }

    public static Node creatbst(int arr[], int st, int end){
        if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        Node root = new Node(arr[mid]);
        root.left =creatbst(arr, st, mid-1);
        root.right= creatbst(arr, mid+1, end);
        return root;
    }

    public static void priorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        priorder(root.left);
        priorder(root.right);
    }

    public static void main(String[] args) {

            //      8
            //     / \
            //    5   10
            //   / \  / \
            //  3   6 11 12


        int arr[]={3,5,6,8,10,11,12};
        Node root= creatbst(arr, 0, arr.length-1);
        priorder(root);
    } 
}
