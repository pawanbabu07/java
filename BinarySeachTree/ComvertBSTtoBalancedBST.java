package BinarySeachTree;

import java.util.ArrayList;

public class ComvertBSTtoBalancedBST {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data= data;
            this.left= this.right= null;
        }
    }

    public static void priorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        priorder(root.left);
        priorder(root.right);
    }

    public static void getInorder(Node root, ArrayList<Integer> inorder){
        if(root==null){
            return;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }


    public static Node creatBST(ArrayList<Integer> inorder, int st, int end){
        if(st>end){
            return null;
        }

        int mid=(st+end)/2;
        Node root=new Node(inorder.get(mid));
        root.left= creatBST(inorder, st, mid-1);
        root.right= creatBST(inorder, mid+1, end);
        return root;
    }

    public static Node balanceBST(Node root){
        //Inorder sequnce
        ArrayList<Integer> inorder=new ArrayList<>();
        getInorder(root, inorder);

        //shorted inorder -> balanced BST
        root= creatBST(inorder,0, inorder.size()-1);
        return root;

    }
    public static void main(String[] args) {


        Node root = new Node(8);
        root.left=new Node(6);
        root.left.left=new Node(5);
        root.left.left.left =new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);


        root= balanceBST(root);
        priorder(root);
    }
}
